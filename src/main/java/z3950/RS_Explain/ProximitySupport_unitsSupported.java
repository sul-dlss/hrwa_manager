/*
 * $Source$
 * $Date$
 * $Revision$
 *
 * Copyright (C) 1998, Hoylen Sue.  All Rights Reserved.
 * <h.sue@ieee.org>
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  Refer to
 * the supplied license for more details.
 *
 * Generated by Zebulun ASN1tojava: 1998-09-08 03:15:20 UTC
 */

//----------------------------------------------------------------

package z3950.RS_Explain;
import asn1.*;
import z3950.v3.AttributeElement;
import z3950.v3.AttributeList;
import z3950.v3.AttributeSetId;
import z3950.v3.DatabaseName;
import z3950.v3.ElementSetName;
import z3950.v3.IntUnit;
import z3950.v3.InternationalString;
import z3950.v3.OtherInformation;
import z3950.v3.Specification;
import z3950.v3.StringOrNumeric;
import z3950.v3.Term;
import z3950.v3.Unit;

//================================================================
/**
 * Class for representing a <code>ProximitySupport_unitsSupported</code> from <code>RecordSyntax-explain</code>
 *
 * <pre>
 * ProximitySupport_unitsSupported ::=
 * CHOICE {
 *   known [1] IMPLICIT INTEGER
 *   private [2] IMPLICIT ProximitySupport_private
 * }
 * </pre>
 *
 * @version	$Release$ $Date$
 */

//----------------------------------------------------------------

public final class ProximitySupport_unitsSupported extends ASN1Any
{

  public final static String VERSION = "Copyright (C) Hoylen Sue, 1998. 199809080315Z";

//----------------------------------------------------------------
/**
 * Default constructor for a ProximitySupport_unitsSupported.
 */

public
ProximitySupport_unitsSupported()
{
}

//----------------------------------------------------------------
/**
 * Constructor for a ProximitySupport_unitsSupported from a BER encoding.
 * <p>
 *
 * @param ber the BER encoding.
 * @param check_tag will check tag if true, use false
 *         if the BER has been implicitly tagged. You should
 *         usually be passing true.
 * @exception	ASN1Exception if the BER encoding is bad.
 */

public
ProximitySupport_unitsSupported(BEREncoding ber, boolean check_tag)
       throws ASN1Exception
{
  super(ber, check_tag);
}

//----------------------------------------------------------------
/**
 * Initializing object from a BER encoding.
 * This method is for internal use only. You should use
 * the constructor that takes a BEREncoding.
 *
 * @param ber the BER to decode.
 * @param check_tag if the tag should be checked.
 * @exception ASN1Exception if the BER encoding is bad.
 */

public void
ber_decode(BEREncoding ber, boolean check_tag)
       throws ASN1Exception
{
  // Null out all choices

  c_known = null;
  c_private = null;

  // Try choice known
  if (ber.tag_get() == 1 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_known = new ASN1Integer(ber, false);
    return;
  }

  // Try choice private
  if (ber.tag_get() == 2 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_private = new ProximitySupport_private(ber, false);
    return;
  }

  throw new ASN1Exception("Zebulun ProximitySupport_unitsSupported: bad BER encoding: choice not matched");
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of ProximitySupport_unitsSupported.
 *
 * @return	The BER encoding.
 * @exception	ASN1Exception Invalid or cannot be encoded.
 */

public BEREncoding
ber_encode()
       throws ASN1Exception
{
  BEREncoding chosen = null;

  // Encoding choice: c_known
  if (c_known != null) {
    chosen = c_known.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1);
  }

  // Encoding choice: c_private
  if (c_private != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_private.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 2);
  }

  // Check for error of having none of the choices set
  if (chosen == null)
    throw new ASN1Exception("CHOICE not set");

  return chosen;
}

//----------------------------------------------------------------

/**
 * Generating a BER encoding of the object
 * and implicitly tagging it.
 * <p>
 * This method is for internal use only. You should use
 * the ber_encode method that does not take a parameter.
 * <p>
 * This function should never be used, because this
 * production is a CHOICE.
 * It must never have an implicit tag.
 * <p>
 * An exception will be thrown if it is called.
 *
 * @param tag_type the type of the tag.
 * @param tag the tag.
 * @exception ASN1Exception if it cannot be BER encoded.
 */

public BEREncoding
ber_encode(int tag_type, int tag)
       throws ASN1Exception
{
  // This method must not be called!

  // Method is not available because this is a basic CHOICE
  // which does not have an explicit tag on it. So it is not
  // permitted to allow something else to apply an implicit
  // tag on it, otherwise the tag identifying which CHOICE
  // it is will be overwritten and lost.

  throw new ASN1EncodingException("Zebulun ProximitySupport_unitsSupported: cannot implicitly tag");
}

//----------------------------------------------------------------
/**
 * Returns a new String object containing a text representing
 * of the ProximitySupport_unitsSupported. 
 */

public String
toString()
{
  StringBuffer str = new StringBuffer("{");

  boolean found = false;

  if (c_known != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: known> ");
    found = true;
    str.append("known ");
  str.append(c_known);
  }

  if (c_private != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: private> ");
    found = true;
    str.append("private ");
  str.append(c_private);
  }

  str.append("}");

  return str.toString();
}

//----------------------------------------------------------------
/*
 * Internal variables for class.
 */

public ASN1Integer c_known;
public ProximitySupport_private c_private;

} // ProximitySupport_unitsSupported

//----------------------------------------------------------------
//EOF
