package cn;


public class FileStatus {
    private boolean isDir;
    private boolean isFile;
    private long fileSize;
    private String owner;
    private String group;
    private  String filePath;
    private DataType dataType;

    public FileStatus(boolean isDir, boolean isFile, long fileSize, String owner, String group, String filePath) {
        this.isDir = isDir;
        this.isFile = isFile;
        this.fileSize = fileSize;
        this.owner = owner;
        this.group = group;
        this.filePath = filePath;
    }

    public FileStatus() {
    }

    public boolean isDir() {
        return isDir;
    }

    public void setDir(boolean dir) {
        isDir = dir;
    }

    public boolean isFile() {
        return isFile;
    }

    public void setFile(boolean file) {
        isFile = file;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileStatus that = (FileStatus) o;

        return filePath.equals(that.filePath);
    }

    @Override
    public int hashCode() {
        return filePath.hashCode();
    }
}
