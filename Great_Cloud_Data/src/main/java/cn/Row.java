package cn;

public interface Row {

   public String getStringValue(String key);

    public Long getLongValue(String key);

    public Boolean getBooleanValue(String key);

    public int  getIntegerValue(String key);

    public String getDataType(String key);

    public Object indexOf(int i);

    public int getIndexBound();



}
