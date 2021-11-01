package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        String text = textReport.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println();
        JSONReport report = new JSONReport();
        String text2 = report.generate("name", "body");
        System.out.println(text2);
    }
}
