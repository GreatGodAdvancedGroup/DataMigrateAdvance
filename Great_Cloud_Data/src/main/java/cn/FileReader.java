package cn;

import java.io.File;
import java.io.FileNotFoundException;

public interface FileReader {
    /**
     * 一次性读取该文件所有信息
     */
    public int read(byte[] b);
    public void read(String b);
    public Row readLine();
    public boolean isExist(File filePath);

    /**
     *
     * @param filePath 文件路径
     * @return  0代表目录，1代表文件
     * @throws FileNotFoundException
     */
    public FileStatus getFileStatus(File filePath) throws FileNotFoundException;

}
