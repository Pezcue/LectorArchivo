package lectorArchivo.reader.DTO;

public class Request {
    private String urlFile;

    public Request() {
    }

    public Request(String urlFile) {
        this.urlFile = urlFile;
    }

    public String getUrl() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }
}
