package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String normalizedCode() {
        if (code == null) return null;
        return code.trim().toUpperCase();
    }
    public String properTitle() {
        if (title == null) return null;
        StringBuilder sb = new StringBuilder();
        String[] words = title.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                sb.append(Character.toUpperCase(words[i].charAt(0)))
                        .append(words[i].substring(1).toLowerCase());
                if (i < words.length - 1) sb.append(" ");
            }
        }
        return sb.toString();
    }
    public boolean isIntroCourse() {
        if (title != null && title.toLowerCase().contains("intro")) {
            return true;
        }
        else if (code != null && code.trim().toUpperCase().startsWith("INTRO-")) {
            return true;}
        return false;
    }
    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();
        sb.append(normalizedCode())
                .append(" - ")
                .append(properTitle())
                .append(" (Instructor: ");
        if (instructor != null) {
            sb.append(instructor.getSecondName() != null ? instructor.getSecondName() : "")
                    .append(" ")
                    .append(instructor.getFirstName() != null ? instructor.getFirstName() : "");
        }
        sb.append(")");
        return sb.toString();
    }


}
