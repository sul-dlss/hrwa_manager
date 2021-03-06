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
 * Generated by Zebulun ASN1tojava: 1998-09-08 03:20:30 UTC
 */

//----------------------------------------------------------------

package z3950.ESFormat_CIP2_4Order;
import asn1.*;
import z3950.v3.InternationalString;
import z3950.v3.OtherInformation;

//================================================================
/**
 * Class for representing a <code>PackageSpec</code> from <code>CIP-Order-ES</code>
 *
 * <pre>
 * PackageSpec ::=
 * SEQUENCE {
 *   packageId [1] EXPLICIT InternationalString OPTIONAL
 *   packagePrice [2] EXPLICIT PriceInfo OPTIONAL
 *   package [3] EXPLICIT PackageSpec_package
 *   packageMedium [4] EXPLICIT InternationalString
 *   packageKByteSize [5] EXPLICIT INTEGER
 *   otherInfo [6] EXPLICIT OtherInformation OPTIONAL
 * }
 * </pre>
 *
 * @version	$Release$ $Date$
 */

//----------------------------------------------------------------

public final class PackageSpec extends ASN1Any
{

  public final static String VERSION = "Copyright (C) Hoylen Sue, 1998. 199809080320Z";

//----------------------------------------------------------------
/**
 * Default constructor for a PackageSpec.
 */

public
PackageSpec()
{
}

//----------------------------------------------------------------
/**
 * Constructor for a PackageSpec from a BER encoding.
 * <p>
 *
 * @param ber the BER encoding.
 * @param check_tag will check tag if true, use false
 *         if the BER has been implicitly tagged. You should
 *         usually be passing true.
 * @exception	ASN1Exception if the BER encoding is bad.
 */

public
PackageSpec(BEREncoding ber, boolean check_tag)
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
  // PackageSpec should be encoded by a constructed BER

  BERConstructed ber_cons;
  try {
    ber_cons = (BERConstructed) ber;
  } catch (ClassCastException e) {
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad BER form\n");
  }

  // Prepare to decode the components

  int num_parts = ber_cons.number_components();
  int part = 0;
  BEREncoding p;
  BERConstructed tagged;

  // Decoding: packageId [1] EXPLICIT InternationalString OPTIONAL

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun PackageSpec: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 1 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagged = (BERConstructed) p;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun PackageSpec: bad BER encoding: s_packageId tag bad\n");
    }
    if (tagged.number_components() != 1) {
      throw new ASN1EncodingException
        ("Zebulun PackageSpec: bad BER encoding: s_packageId tag bad\n");
    }

    s_packageId = new InternationalString(tagged.elementAt(0), true);
    part++;
  }

  // Decoding: packagePrice [2] EXPLICIT PriceInfo OPTIONAL

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun PackageSpec: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 2 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagged = (BERConstructed) p;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun PackageSpec: bad BER encoding: s_packagePrice tag bad\n");
    }
    if (tagged.number_components() != 1) {
      throw new ASN1EncodingException
        ("Zebulun PackageSpec: bad BER encoding: s_packagePrice tag bad\n");
    }

    s_packagePrice = new PriceInfo(tagged.elementAt(0), true);
    part++;
  }

  // Decoding: package [3] EXPLICIT PackageSpec_package

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun PackageSpec: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 3 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad tag in s_package\n");

  try {
    tagged = (BERConstructed) p;
  } catch (ClassCastException e) {
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad BER encoding: s_package tag bad\n");
  }
  if (tagged.number_components() != 1) {
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad BER encoding: s_package tag bad\n");
  }

  s_package = new PackageSpec_package(tagged.elementAt(0), true);
  part++;

  // Decoding: packageMedium [4] EXPLICIT InternationalString

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun PackageSpec: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 4 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad tag in s_packageMedium\n");

  try {
    tagged = (BERConstructed) p;
  } catch (ClassCastException e) {
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad BER encoding: s_packageMedium tag bad\n");
  }
  if (tagged.number_components() != 1) {
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad BER encoding: s_packageMedium tag bad\n");
  }

  s_packageMedium = new InternationalString(tagged.elementAt(0), true);
  part++;

  // Decoding: packageKByteSize [5] EXPLICIT INTEGER

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun PackageSpec: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 5 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad tag in s_packageKByteSize\n");

  try {
    tagged = (BERConstructed) p;
  } catch (ClassCastException e) {
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad BER encoding: s_packageKByteSize tag bad\n");
  }
  if (tagged.number_components() != 1) {
    throw new ASN1EncodingException
      ("Zebulun PackageSpec: bad BER encoding: s_packageKByteSize tag bad\n");
  }

  s_packageKByteSize = new ASN1Integer(tagged.elementAt(0), true);
  part++;

  // Remaining elements are optional, set variables
  // to null (not present) so can return at end of BER

  s_otherInfo = null;

  // Decoding: otherInfo [6] EXPLICIT OtherInformation OPTIONAL

  if (num_parts <= part) {
    return; // no more data, but ok (rest is optional)
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 6 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagged = (BERConstructed) p;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun PackageSpec: bad BER encoding: s_otherInfo tag bad\n");
    }
    if (tagged.number_components() != 1) {
      throw new ASN1EncodingException
        ("Zebulun PackageSpec: bad BER encoding: s_otherInfo tag bad\n");
    }

    s_otherInfo = new OtherInformation(tagged.elementAt(0), true);
    part++;
  }

  // Should not be any more parts

  if (part < num_parts) {
    throw new ASN1Exception("Zebulun PackageSpec: bad BER: extra data " + part + "/" + num_parts + " processed");
  }
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of the PackageSpec.
 *
 * @exception	ASN1Exception Invalid or cannot be encoded.
 * @return	The BER encoding.
 */

public BEREncoding
ber_encode()
       throws ASN1Exception
{
  return ber_encode(BEREncoding.UNIVERSAL_TAG, ASN1Sequence.TAG);
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of PackageSpec, implicitly tagged.
 *
 * @param tag_type	The type of the implicit tag.
 * @param tag	The implicit tag.
 * @return	The BER encoding of the object.
 * @exception	ASN1Exception When invalid or cannot be encoded.
 * @see asn1.BEREncoding#UNIVERSAL_TAG
 * @see asn1.BEREncoding#APPLICATION_TAG
 * @see asn1.BEREncoding#CONTEXT_SPECIFIC_TAG
 * @see asn1.BEREncoding#PRIVATE_TAG
 */

public BEREncoding
ber_encode(int tag_type, int tag)
       throws ASN1Exception
{
  // Calculate the number of fields in the encoding

  int num_fields = 3; // number of mandatories
  if (s_packageId != null)
    num_fields++;
  if (s_packagePrice != null)
    num_fields++;
  if (s_otherInfo != null)
    num_fields++;

  // Encode it

  BEREncoding fields[] = new BEREncoding[num_fields];
  int x = 0;
  BEREncoding enc[];

  // Encoding s_packageId: InternationalString OPTIONAL

  if (s_packageId != null) {
    enc = new BEREncoding[1];
    enc[0] = s_packageId.ber_encode();
    fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1, enc);
  }

  // Encoding s_packagePrice: PriceInfo OPTIONAL

  if (s_packagePrice != null) {
    enc = new BEREncoding[1];
    enc[0] = s_packagePrice.ber_encode();
    fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 2, enc);
  }

  // Encoding s_package: PackageSpec_package 

  enc = new BEREncoding[1];
  enc[0] = s_package.ber_encode();
  fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 3, enc);

  // Encoding s_packageMedium: InternationalString 

  enc = new BEREncoding[1];
  enc[0] = s_packageMedium.ber_encode();
  fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 4, enc);

  // Encoding s_packageKByteSize: INTEGER 

  enc = new BEREncoding[1];
  enc[0] = s_packageKByteSize.ber_encode();
  fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 5, enc);

  // Encoding s_otherInfo: OtherInformation OPTIONAL

  if (s_otherInfo != null) {
    enc = new BEREncoding[1];
    enc[0] = s_otherInfo.ber_encode();
    fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 6, enc);
  }

  return new BERConstructed(tag_type, tag, fields);
}

//----------------------------------------------------------------
/**
 * Returns a new String object containing a text representing
 * of the PackageSpec. 
 */

public String
toString()
{
  StringBuffer str = new StringBuffer("{");
  int outputted = 0;

  if (s_packageId != null) {
    str.append("packageId ");
    str.append(s_packageId);
    outputted++;
  }

  if (s_packagePrice != null) {
    if (0 < outputted)
    str.append(", ");
    str.append("packagePrice ");
    str.append(s_packagePrice);
    outputted++;
  }

  if (0 < outputted)
    str.append(", ");
  str.append("package ");
  str.append(s_package);
  outputted++;

  if (0 < outputted)
    str.append(", ");
  str.append("packageMedium ");
  str.append(s_packageMedium);
  outputted++;

  if (0 < outputted)
    str.append(", ");
  str.append("packageKByteSize ");
  str.append(s_packageKByteSize);
  outputted++;

  if (s_otherInfo != null) {
    if (0 < outputted)
    str.append(", ");
    str.append("otherInfo ");
    str.append(s_otherInfo);
    outputted++;
  }

  str.append("}");

  return str.toString();
}

//----------------------------------------------------------------
/*
 * Internal variables for class.
 */

public InternationalString s_packageId; // optional
public PriceInfo s_packagePrice; // optional
public PackageSpec_package s_package;
public InternationalString s_packageMedium;
public ASN1Integer s_packageKByteSize;
public OtherInformation s_otherInfo; // optional

} // PackageSpec

//----------------------------------------------------------------
//EOF
