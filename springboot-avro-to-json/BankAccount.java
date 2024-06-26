/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class BankAccount extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3782739077780920565L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BankAccount\",\"fields\":[{\"name\":\"accountId\",\"type\":\"string\"},{\"name\":\"accountType\",\"type\":\"string\"},{\"name\":\"balance\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BankAccount> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BankAccount> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<BankAccount> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<BankAccount> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<BankAccount> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this BankAccount to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a BankAccount from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a BankAccount instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static BankAccount fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence accountId;
  private java.lang.CharSequence accountType;
  private double balance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BankAccount() {}

  /**
   * All-args constructor.
   * @param accountId The new value for accountId
   * @param accountType The new value for accountType
   * @param balance The new value for balance
   */
  public BankAccount(java.lang.CharSequence accountId, java.lang.CharSequence accountType, java.lang.Double balance) {
    this.accountId = accountId;
    this.accountType = accountType;
    this.balance = balance;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return accountId;
    case 1: return accountType;
    case 2: return balance;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: accountId = (java.lang.CharSequence)value$; break;
    case 1: accountType = (java.lang.CharSequence)value$; break;
    case 2: balance = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'accountId' field.
   * @return The value of the 'accountId' field.
   */
  public java.lang.CharSequence getAccountId() {
    return accountId;
  }


  /**
   * Sets the value of the 'accountId' field.
   * @param value the value to set.
   */
  public void setAccountId(java.lang.CharSequence value) {
    this.accountId = value;
  }

  /**
   * Gets the value of the 'accountType' field.
   * @return The value of the 'accountType' field.
   */
  public java.lang.CharSequence getAccountType() {
    return accountType;
  }


  /**
   * Sets the value of the 'accountType' field.
   * @param value the value to set.
   */
  public void setAccountType(java.lang.CharSequence value) {
    this.accountType = value;
  }

  /**
   * Gets the value of the 'balance' field.
   * @return The value of the 'balance' field.
   */
  public double getBalance() {
    return balance;
  }


  /**
   * Sets the value of the 'balance' field.
   * @param value the value to set.
   */
  public void setBalance(double value) {
    this.balance = value;
  }

  /**
   * Creates a new BankAccount RecordBuilder.
   * @return A new BankAccount RecordBuilder
   */
  public static BankAccount.Builder newBuilder() {
    return new BankAccount.Builder();
  }

  /**
   * Creates a new BankAccount RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BankAccount RecordBuilder
   */
  public static BankAccount.Builder newBuilder(BankAccount.Builder other) {
    if (other == null) {
      return new BankAccount.Builder();
    } else {
      return new BankAccount.Builder(other);
    }
  }

  /**
   * Creates a new BankAccount RecordBuilder by copying an existing BankAccount instance.
   * @param other The existing instance to copy.
   * @return A new BankAccount RecordBuilder
   */
  public static BankAccount.Builder newBuilder(BankAccount other) {
    if (other == null) {
      return new BankAccount.Builder();
    } else {
      return new BankAccount.Builder(other);
    }
  }

  /**
   * RecordBuilder for BankAccount instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BankAccount>
    implements org.apache.avro.data.RecordBuilder<BankAccount> {

    private java.lang.CharSequence accountId;
    private java.lang.CharSequence accountType;
    private double balance;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(BankAccount.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.accountType)) {
        this.accountType = data().deepCopy(fields()[1].schema(), other.accountType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.balance)) {
        this.balance = data().deepCopy(fields()[2].schema(), other.balance);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing BankAccount instance
     * @param other The existing instance to copy.
     */
    private Builder(BankAccount other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.accountType)) {
        this.accountType = data().deepCopy(fields()[1].schema(), other.accountType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.balance)) {
        this.balance = data().deepCopy(fields()[2].schema(), other.balance);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'accountId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountId() {
      return accountId;
    }


    /**
      * Sets the value of the 'accountId' field.
      * @param value The value of 'accountId'.
      * @return This builder.
      */
    public BankAccount.Builder setAccountId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.accountId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'accountId' field has been set.
      * @return True if the 'accountId' field has been set, false otherwise.
      */
    public boolean hasAccountId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'accountId' field.
      * @return This builder.
      */
    public BankAccount.Builder clearAccountId() {
      accountId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'accountType' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountType() {
      return accountType;
    }


    /**
      * Sets the value of the 'accountType' field.
      * @param value The value of 'accountType'.
      * @return This builder.
      */
    public BankAccount.Builder setAccountType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.accountType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'accountType' field has been set.
      * @return True if the 'accountType' field has been set, false otherwise.
      */
    public boolean hasAccountType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'accountType' field.
      * @return This builder.
      */
    public BankAccount.Builder clearAccountType() {
      accountType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'balance' field.
      * @return The value.
      */
    public double getBalance() {
      return balance;
    }


    /**
      * Sets the value of the 'balance' field.
      * @param value The value of 'balance'.
      * @return This builder.
      */
    public BankAccount.Builder setBalance(double value) {
      validate(fields()[2], value);
      this.balance = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'balance' field has been set.
      * @return True if the 'balance' field has been set, false otherwise.
      */
    public boolean hasBalance() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'balance' field.
      * @return This builder.
      */
    public BankAccount.Builder clearBalance() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BankAccount build() {
      try {
        BankAccount record = new BankAccount();
        record.accountId = fieldSetFlags()[0] ? this.accountId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.accountType = fieldSetFlags()[1] ? this.accountType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.balance = fieldSetFlags()[2] ? this.balance : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BankAccount>
    WRITER$ = (org.apache.avro.io.DatumWriter<BankAccount>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BankAccount>
    READER$ = (org.apache.avro.io.DatumReader<BankAccount>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.accountId);

    out.writeString(this.accountType);

    out.writeDouble(this.balance);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.accountId = in.readString(this.accountId instanceof Utf8 ? (Utf8)this.accountId : null);

      this.accountType = in.readString(this.accountType instanceof Utf8 ? (Utf8)this.accountType : null);

      this.balance = in.readDouble();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.accountId = in.readString(this.accountId instanceof Utf8 ? (Utf8)this.accountId : null);
          break;

        case 1:
          this.accountType = in.readString(this.accountType instanceof Utf8 ? (Utf8)this.accountType : null);
          break;

        case 2:
          this.balance = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










