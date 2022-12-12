import java.util.Scanner;

public class Software {
    private String name;
    private String size;
    private int releaseYear;
    private String platform;

    public Software() {
    }

    public Software(String name, String size, int releaseYear, String platform) {
        setName(name);
        this.size = size;
        setReleaseYear(releaseYear);
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String checker = "0123456789+-*/=_]}[{'\";:/?.>,<)(&^%$#@!~`\\|";
        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < checker.length(); j++) {
                if (name.charAt(i) == checker.charAt(j)) {
                    index++;
                }
            }
        }
        if (index != 0 || name.isBlank()) {
            String msg = " - Error! ";
            throw new InvalidNameException(msg, name);
        } else {
            this.name = name;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.isBlank()) {
            String msg = " - Error! - ";
            throw new InvalidSizeException(msg, size);
        } else {
            this.size = size;
        }
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear <= 0 && releaseYear > 2022) {
            String msg = " - Error! - ";
            throw new InvalidYearException(msg, releaseYear);
        } else {
            this.releaseYear = releaseYear;
        }
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        if (platform == null || platform.isBlank()) {
            String msg = " - Error! - ";
            throw new InvalidPlatException(msg, platform);
        } else {
            this.platform = platform;
        }
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", releaseYear=" + releaseYear +
                ", platform='" + platform + '\'' +
                '}';
    }
}
