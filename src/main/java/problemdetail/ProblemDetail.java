package problemdetail;

public class ProblemDetail {

    private String type;
    private String title;
    private String detail;
    private String status;
    private String instance;

    public ProblemDetail() {}

    public ProblemDetail(String type, String title, String detail, String status, String instance) {
        this.type = type;
        this.title = title;
        this.detail = detail;
        this.status = status;
        this.instance = instance;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public String getStatus() {
        return status;
    }

    public String getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "ProblemDetail{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", status='" + status + '\'' +
                ", instance='" + instance + '\'' +
                '}';
    }
}
