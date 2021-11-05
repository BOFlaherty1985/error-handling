package problemdetail;

public class ProblemDetailBuilder {

    private String type;
    private String title;
    private String detail;
    private String status;
    private String instance;

    public static ProblemDetailBuilder problemDetailBuilder() {
        return new ProblemDetailBuilder();
    }

    public ProblemDetail build() {
        ProblemDetail problemDetail = new ProblemDetail(type, title, detail, status, instance);
        return problemDetail;
    }

    public ProblemDetailBuilder type(String type) {
        this.type = type;
        return this;
    }

    public ProblemDetailBuilder title(String title) {
        this.title = title;
        return this;
    }

    public ProblemDetailBuilder detail(String detail) {
        this.detail = detail;
        return this;
    }

    public ProblemDetailBuilder status(String status) {
        this.status = status;
        return this;
    }

    public ProblemDetailBuilder instance(String instance) {
        this.instance = instance;
        return this;
    }
}
