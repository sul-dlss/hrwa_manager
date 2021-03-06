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
 * Generated by Zebulun ASN1tojava: 1998-09-08 03:20:31 UTC
 */

//----------------------------------------------------------------

package z3950.CIP2_4FormattedSceneSelectionOptions;
import asn1.*;
import z3950.v3.InternationalString;
import z3950.v3.IntUnit;

//================================================================
/**
 * Class for representing a <code>FormattedSceneSelectionOptions</code> from <code>CIP2-4-Order-ES</code>
 *
 * <pre>
 * FormattedSceneSelectionOptions ::=
 * SEQUENCE {
 *   sceneType [1] EXPLICIT InternationalString
 *   horizontalSelection [2] EXPLICIT HorizontalSelection OPTIONAL
 *   verticalSelection [3] EXPLICIT VerticalSelection OPTIONAL
 *   temporalSelection [4] EXPLICIT TemporalSelection OPTIONAL
 * }
 * </pre>
 *
 * @version	$Release$ $Date$
 */

//----------------------------------------------------------------

public final class FormattedSceneSelectionOptions extends ASN1Any
{

  public final static String VERSION = "Copyright (C) Hoylen Sue, 1998. 199809080320Z";

//----------------------------------------------------------------
/**
 * Default constructor for a FormattedSceneSelectionOptions.
 */

public
FormattedSceneSelectionOptions()
{
}

//----------------------------------------------------------------
/**
 * Constructor for a FormattedSceneSelectionOptions from a BER encoding.
 * <p>
 *
 * @param ber the BER encoding.
 * @param check_tag will check tag if true, use false
 *         if the BER has been implicitly tagged. You should
 *         usually be passing true.
 * @exception	ASN1Exception if the BER encoding is bad.
 */

public
FormattedSceneSelectionOptions(BEREncoding ber, boolean check_tag)
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
  // FormattedSceneSelectionOptions should be encoded by a constructed BER

  BERConstructed ber_cons;
  try {
    ber_cons = (BERConstructed) ber;
  } catch (ClassCastException e) {
    throw new ASN1EncodingException
      ("Zebulun FormattedSceneSelectionOptions: bad BER form\n");
  }

  // Prepare to decode the components

  int num_parts = ber_cons.number_components();
  int part = 0;
  BEREncoding p;
  BERConstructed tagged;

  // Decoding: sceneType [1] EXPLICIT InternationalString

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun FormattedSceneSelectionOptions: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 1 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun FormattedSceneSelectionOptions: bad tag in s_sceneType\n");

  try {
    tagged = (BERConstructed) p;
  } catch (ClassCastException e) {
    throw new ASN1EncodingException
      ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_sceneType tag bad\n");
  }
  if (tagged.number_components() != 1) {
    throw new ASN1EncodingException
      ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_sceneType tag bad\n");
  }

  s_sceneType = new InternationalString(tagged.elementAt(0), true);
  part++;

  // Remaining elements are optional, set variables
  // to null (not present) so can return at end of BER

  s_horizontalSelection = null;
  s_verticalSelection = null;
  s_temporalSelection = null;

  // Decoding: horizontalSelection [2] EXPLICIT HorizontalSelection OPTIONAL

  if (num_parts <= part) {
    return; // no more data, but ok (rest is optional)
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 2 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagged = (BERConstructed) p;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_horizontalSelection tag bad\n");
    }
    if (tagged.number_components() != 1) {
      throw new ASN1EncodingException
        ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_horizontalSelection tag bad\n");
    }

    s_horizontalSelection = new HorizontalSelection(tagged.elementAt(0), true);
    part++;
  }

  // Decoding: verticalSelection [3] EXPLICIT VerticalSelection OPTIONAL

  if (num_parts <= part) {
    return; // no more data, but ok (rest is optional)
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 3 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagged = (BERConstructed) p;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_verticalSelection tag bad\n");
    }
    if (tagged.number_components() != 1) {
      throw new ASN1EncodingException
        ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_verticalSelection tag bad\n");
    }

    s_verticalSelection = new VerticalSelection(tagged.elementAt(0), true);
    part++;
  }

  // Decoding: temporalSelection [4] EXPLICIT TemporalSelection OPTIONAL

  if (num_parts <= part) {
    return; // no more data, but ok (rest is optional)
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 4 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagged = (BERConstructed) p;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_temporalSelection tag bad\n");
    }
    if (tagged.number_components() != 1) {
      throw new ASN1EncodingException
        ("Zebulun FormattedSceneSelectionOptions: bad BER encoding: s_temporalSelection tag bad\n");
    }

    s_temporalSelection = new TemporalSelection(tagged.elementAt(0), true);
    part++;
  }

  // Should not be any more parts

  if (part < num_parts) {
    throw new ASN1Exception("Zebulun FormattedSceneSelectionOptions: bad BER: extra data " + part + "/" + num_parts + " processed");
  }
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of the FormattedSceneSelectionOptions.
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
 * Returns a BER encoding of FormattedSceneSelectionOptions, implicitly tagged.
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

  int num_fields = 1; // number of mandatories
  if (s_horizontalSelection != null)
    num_fields++;
  if (s_verticalSelection != null)
    num_fields++;
  if (s_temporalSelection != null)
    num_fields++;

  // Encode it

  BEREncoding fields[] = new BEREncoding[num_fields];
  int x = 0;
  BEREncoding enc[];

  // Encoding s_sceneType: InternationalString 

  enc = new BEREncoding[1];
  enc[0] = s_sceneType.ber_encode();
  fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1, enc);

  // Encoding s_horizontalSelection: HorizontalSelection OPTIONAL

  if (s_verticalSelection != null) {
    enc = new BEREncoding[1];
    enc[0] = s_horizontalSelection.ber_encode();
    fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 2, enc);
  }
  // Encoding s_verticalSelection: VerticalSelection OPTIONAL

  if (s_verticalSelection != null) {
    enc = new BEREncoding[1];
    enc[0] = s_verticalSelection.ber_encode();
    fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 3, enc);
  }

  // Encoding s_temporalSelection: TemporalSelection OPTIONAL

  if (s_temporalSelection != null) {
    enc = new BEREncoding[1];
    enc[0] = s_temporalSelection.ber_encode();
    fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 4, enc);
  }

  return new BERConstructed(tag_type, tag, fields);
}

//----------------------------------------------------------------
/**
 * Returns a new String object containing a text representing
 * of the FormattedSceneSelectionOptions. 
 */

public String
toString()
{
  StringBuffer str = new StringBuffer("{");
  int outputted = 0;

  str.append("sceneType ");
  str.append(s_sceneType);
  outputted++;

  if (s_horizontalSelection != null) {
    if (0 < outputted)
    str.append(", ");
    str.append("horizontalSelection ");
    str.append(s_horizontalSelection);
    outputted++;
  }

  if (s_verticalSelection != null) {
    if (0 < outputted)
    str.append(", ");
    str.append("verticalSelection ");
    str.append(s_verticalSelection);
    outputted++;
  }

  if (s_temporalSelection != null) {
    if (0 < outputted)
    str.append(", ");
    str.append("temporalSelection ");
    str.append(s_temporalSelection);
    outputted++;
  }

  str.append("}");

  return str.toString();
}

//----------------------------------------------------------------
/*
 * Internal variables for class.
 */

public InternationalString s_sceneType;
public HorizontalSelection s_horizontalSelection; // optional
public VerticalSelection s_verticalSelection; // optional
public TemporalSelection s_temporalSelection; // optional

} // FormattedSceneSelectionOptions

//----------------------------------------------------------------
//EOF
