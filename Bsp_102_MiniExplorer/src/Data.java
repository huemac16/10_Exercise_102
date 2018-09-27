
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
        String det = "";
        if (isDirectory()) {
            return this.getName();
        } else {
            if(this.canRead())det+="R";
            if(this.canWrite())det+="W";
            if(this.canExecute())det+="X";
            LocalDateTime ldt
                    = LocalDateTime.ofEpochSecond(
                            this.lastModified() / 1000, 0, ZoneOffset.UTC);

            return String.format("%-20s %-20s %d KB  %s", this.getName(), ldt.format(dtf), this.length() / 1024 , det);

        }

    }

}
