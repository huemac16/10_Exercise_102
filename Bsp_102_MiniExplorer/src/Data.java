
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Data extends File {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");

    public Data(String absolutePath) {
        super(absolutePath);

    }

    @Override
    public String toString() {
        if (isDirectory()) {
            return this.getName();
        } else {
            LocalDateTime ldt
                    = LocalDateTime.ofEpochSecond(
                            this.lastModified() / 1000, 0, ZoneOffset.UTC);

            return String.format("%s %-30s %-30d KB", this.getName(), ldt.format(dtf), this.length() / 1024);

        }

    }

}
