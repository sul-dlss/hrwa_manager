package edu.columbia.ldpd.hrwa.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.archive.io.ArchiveReader;
import org.archive.io.ArchiveReaderFactory;
import org.archive.io.arc.ARCRecord;
import org.archive.nutchwax.tools.ArcReader;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.DefaultCredentialsProvider;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import edu.columbia.ldpd.hrwa.HrwaManager;
import edu.columbia.ldpd.hrwa.mysql.MySQLHelper;
import edu.columbia.ldpd.hrwa.processorrunnables.ArchiveFileProcessorRunnable;
import edu.columbia.ldpd.hrwa.processorrunnables.MySQLArchiveRecordToSolrProcessorRunnable;
import edu.columbia.ldpd.hrwa.solr.ASFSolrIndexer;

public class QuarterlyMaintenanceTask extends HrwaTask {

	public QuarterlyMaintenanceTask() {
		
	}
	
	public void runTask() {
		
		writeTaskHeaderMessageAndSetStartTime();
		
		//Download archive files
		HrwaTask downloadArchiveFilesFromArchivitTask = new DownloadArchiveFilesFromArchivitTask();
		downloadArchiveFilesFromArchivitTask.runTask();
		
		//Index archive files into MySQL (using CURRENT sites and related_hosts data [i.e. we are
		//not running the SitesToSolrAndMySQLTask], since changes to these tables should only be
		//picked up by the RegularMaintenanceTask in order to avoid having a NEW site status
		//change to UPDATED before it can be recognized and handled as being NEW.)
		HrwaTask archiveToMySQLTask = new ArchiveToMySQLTask();
		archiveToMySQLTask.runTask();
		
		//And then index the newly added MySQL web archive records into Solr
		HrwaTask mySQLArchiveRecordsToSolrTask = new MySQLArchiveRecordsToSolrTask();
		mySQLArchiveRecordsToSolrTask.runTask();
		
		writeTaskFooterMessageAndPrintTotalTime();
		
	}
	
}
