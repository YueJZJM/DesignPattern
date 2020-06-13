package observer.new1;

import java.util.ArrayList;
import java.util.List;

import observer.old.MyProgressBar;

public class FileSplitter {
    private String mFilePath;
    private int mFileNumber;
    private List<IProgressBar> mProgressBars;

    public FileSplitter(String filePath, int fileNumber) {
        mFilePath = filePath;
        mFileNumber = fileNumber;
        mProgressBars = new ArrayList<IProgressBar>();
    }

    public void split() {
        //1.读取大文件

        //2.分批次向小文件中写入
        for (int i = 0; i < mFileNumber; i++){
            //...
            float progressValue = mFileNumber;
            progressValue = (i + 1) / progressValue;
            onProgress(progressValue);//发送通知
        }
    }

    public void addIProgress(IProgressBar progressBar) {
        mProgressBars.add(progressBar);
    }

    public void removeIProgress(IProgressBar progressBar) {
        mProgressBars.remove(progressBar);
    }

    private void onProgress(float progressValue) {
        for (IProgressBar progressBar : mProgressBars) {
            progressBar.doProgress(progressValue);
        }
    }

}
