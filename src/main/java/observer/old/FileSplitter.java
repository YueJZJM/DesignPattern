package observer.old;

/**
 * 读取文件
 */
public class FileSplitter  {
    private String mFilePath;
    private int mFileNumber;
    private MyProgressBar mProgressBar;

    public FileSplitter(String filePath, int fileNumber, MyProgressBar progressBar) {
        mFilePath = filePath;
        mFileNumber = fileNumber;
        mProgressBar = progressBar;
    }

    public void split() {
        //1.读取大文件

        //2.分批次向小文件中写入
        for (int i = 0; i < mFileNumber; i++){
            //...
            float progressValue = mFileNumber;
            progressValue = (i + 1) / progressValue;
            mProgressBar.setValue(progressValue);
        }
    }
}
