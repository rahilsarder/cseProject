package com.example.groupproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class HelloApplication extends Application {

    public void grade(int count, String grade[], double gp[]) {

        if (grade[count].equals("A")) gp[count]=4;
        else if (grade[count].equals("A-")) gp[count]=3.7;
        else if (grade[count].equals("B+")) gp[count]=3.3;
        else if (grade[count].equals("B")) gp[count]=3.0;
        else if (grade[count].equals("B-")) gp[count]=2.7;
        else if (grade[count].equals("C+")) gp[count]=2.3;
        else if (grade[count].equals("C")) gp[count]=2.0;
        else if (grade[count].equals("C-")) gp[count]=1.7;
        else if (grade[count].equals("D+")) gp[count]=1.3;
        else if (grade[count].equals("D")) gp[count]=1.0;
        else if (grade[count].equals("F")) gp[count]=0.0;
        else if (grade[count].equals("I")) gp[count]=0.0;
        else if (grade[count].equals("W")) gp[count]=0.0;
        else if (grade[count].equals("R")) gp[count]=0.0;
    }

    double cgpa = 0.00;

    @Override
    public void start(Stage stage) throws IOException {
//


        Label intro = new Label("CGPA CALCULATOR");
        Label intro2 = new Label("                       COURSE NAME            CREDITS            GRADE");

        HBox hb = new HBox(10, intro);
        HBox hb_intro2 = new HBox(10, intro2);


        String grade_arr[] = new String[5];
        String course_arr[] = new String[5];
        double credits_arr[] = new double[5];
        double grade_point[] = new double[5];


        Label tb_course1 = new Label(" Course 1");
        Label tb_course2 = new Label(" Course 2");
        Label tb_course3 = new Label(" Course 3");
        Label tb_course4 = new Label(" Course 4");
        Label tb_course5 = new Label(" Course 5");

        ComboBox <String> cb1 = new ComboBox<String>();
        cb1.getItems().add("CSE115");
        cb1.getItems().add("CSE115L");
        cb1.getItems().add("CSE173");
        cb1.getItems().add("CSE215");
        cb1.getItems().add("CSE215L");
        cb1.getItems().add("CSE225");
        cb1.getItems().add("CSE225L");
        cb1.getItems().add("CSE231");
        cb1.getItems().add("CSE231L");
        cb1.getItems().add("CSE299");
        cb1.getItems().add("CSE332");
        cb1.getItems().add("CSE311");
        cb1.getItems().add("CSE311L");
        cb1.getItems().add("CSE323");
        cb1.getItems().add("CSE327");
        cb1.getItems().add("CSE331");
        cb1.getItems().add("CSE331L");
        cb1.getItems().add("CSE425");
        cb1.getItems().add("CSE499A");
        cb1.getItems().add("CSE499B");
        cb1.getItems().add("ENG102");
        cb1.getItems().add("ENG103");
        cb1.getItems().add("ENG111");
        cb1.getItems().add("MAT116");
        cb1.getItems().add("MAT120");
        cb1.getItems().add("MAT125");
        cb1.getItems().add("MAT130");
        cb1.getItems().add("MAT250");
        cb1.getItems().add("MAT350");
        cb1.getItems().add("MAT361");
        cb1.getItems().add("HIS102");
        cb1.getItems().add("HIS103");
        cb1.getItems().add("CEE110");
        cb1.getItems().add("BEN205");
        cb1.getItems().add("PHI104");
        cb1.getItems().add("POL101");
        cb1.getItems().add("ECO101");
        cb1.getItems().add("BIO103");
        cb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                course_arr[0] = cb1.getValue();
            }
        });

        ComboBox<String> grade = new ComboBox<>();
        grade.getItems().add("A");
        grade.getItems().add("A-");
        grade.getItems().add("B+");
        grade.getItems().add("B");
        grade.getItems().add("B-");
        grade.getItems().add("C+");
        grade.getItems().add("C");
        grade.getItems().add("C-");
        grade.getItems().add("D+");
        grade.getItems().add("D");
        grade.getItems().add("F*");
        grade.getItems().add("I");
        grade.getItems().add("W");
        grade.getItems().add("R");
        grade.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                grade_arr[0] = grade.getValue();
                grade(0,grade_arr, grade_point);
            }
        });


        ComboBox<String> credits = new ComboBox<>();
        credits.getItems().add("1");
        credits.getItems().add("1.5");
        credits.getItems().add("3");
        credits.getItems().add("4");
        credits.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                credits_arr[0] = Double.parseDouble(credits.getValue());
            }
        });



        // course 2

        ComboBox<String> cb2 = new ComboBox<>();

        cb2.getItems().add("CSE115L");
        cb2.getItems().add("CSE173");
        cb2.getItems().add("CSE215");
        cb2.getItems().add("CSE215L");
        cb2.getItems().add("CSE225");
        cb2.getItems().add("CSE225L");
        cb2.getItems().add("CSE231");
        cb2.getItems().add("CSE231L");
        cb2.getItems().add("CSE299");
        cb2.getItems().add("CSE332");
        cb2.getItems().add("CSE311");
        cb2.getItems().add("CSE311L");
        cb2.getItems().add("CSE323");
        cb2.getItems().add("CSE327");
        cb2.getItems().add("CSE331");
        cb2.getItems().add("CSE331L");
        cb2.getItems().add("CSE425");
        cb2.getItems().add("CSE499A");
        cb2.getItems().add("CSE499B");
        cb2.getItems().add("ENG102");
        cb2.getItems().add("ENG103");
        cb2.getItems().add("ENG111");
        cb2.getItems().add("MAT116");
        cb2.getItems().add("MAT120");
        cb2.getItems().add("MAT125");
        cb2.getItems().add("MAT130");
        cb2.getItems().add("MAT250");
        cb2.getItems().add("MAT350");
        cb2.getItems().add("MAT361");
        cb2.getItems().add("HIS102");
        cb2.getItems().add("HIS103");
        cb2.getItems().add("CEE110");
        cb2.getItems().add("BEN205");
        cb2.getItems().add("PHI104");
        cb2.getItems().add("POL101");
        cb2.getItems().add("ECO101");
        cb2.getItems().add("BIO103");

        cb2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                course_arr[1] =cb2.getValue();
            }
        });


        ComboBox<String> grade2 = new ComboBox<>();
        grade2.getItems().add("A");
        grade2.getItems().add("A-");
        grade2.getItems().add("B+");
        grade2.getItems().add("B");
        grade2.getItems().add("B-");
        grade2.getItems().add("C+");
        grade2.getItems().add("C");
        grade2.getItems().add("C-");
        grade2.getItems().add("D+");
        grade2.getItems().add("D");
        grade2.getItems().add("F*");
        grade2.getItems().add("I");
        grade2.getItems().add("W");
        grade2.getItems().add("R");

        grade2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                grade_arr[1] = grade2.getValue();
                grade(1,grade_arr, grade_point);
            }
        });


        ComboBox<String> credits2 = new ComboBox<>();
        credits2.getItems().add("1");
        credits2.getItems().add("1.5");
        credits2.getItems().add("3");
        credits2.getItems().add("4");

        credits2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                credits_arr[1] = Double.parseDouble(credits2.getValue());
            }
        });


        //Course 3

        ComboBox<String> cb3 = new ComboBox<>();
        cb3.getItems().add("CSE115L");
        cb3.getItems().add("CSE173");
        cb3.getItems().add("CSE215");
        cb3.getItems().add("CSE215L");
        cb3.getItems().add("CSE225");
        cb3.getItems().add("CSE225L");
        cb3.getItems().add("CSE231");
        cb3.getItems().add("CSE231L");
        cb3.getItems().add("CSE299");
        cb3.getItems().add("CSE332");
        cb3.getItems().add("CSE311");
        cb3.getItems().add("CSE311L");
        cb3.getItems().add("CSE323");
        cb3.getItems().add("CSE327");
        cb3.getItems().add("CSE331");
        cb3.getItems().add("CSE331L");
        cb3.getItems().add("CSE425");
        cb3.getItems().add("CSE499A");
        cb3.getItems().add("CSE499B");
        cb3.getItems().add("ENG102");
        cb3.getItems().add("ENG103");
        cb3.getItems().add("ENG111");
        cb3.getItems().add("MAT116");
        cb3.getItems().add("MAT120");
        cb3.getItems().add("MAT125");
        cb3.getItems().add("MAT130");
        cb3.getItems().add("MAT250");
        cb3.getItems().add("MAT350");
        cb3.getItems().add("MAT361");
        cb3.getItems().add("HIS102");
        cb3.getItems().add("HIS103");
        cb3.getItems().add("CEE110");
        cb3.getItems().add("BEN205");
        cb3.getItems().add("PHI104");
        cb3.getItems().add("POL101");
        cb3.getItems().add("ECO101");
        cb3.getItems().add("BIO103");
        cb3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                course_arr[2] =cb3.getValue();
            }
        });



        ComboBox<String> grade3 = new ComboBox<>();
        grade3.getItems().add("A");
        grade3.getItems().add("A-");
        grade3.getItems().add("B+");
        grade3.getItems().add("B");
        grade3.getItems().add("B-");
        grade3.getItems().add("C+");
        grade3.getItems().add("C");
        grade3.getItems().add("C-");
        grade3.getItems().add("D+");
        grade3.getItems().add("D");
        grade3.getItems().add("F*");
        grade3.getItems().add("I");
        grade3.getItems().add("W");
        grade3.getItems().add("R");
        grade3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                grade_arr[2] = grade3.getValue();
                grade(2,grade_arr, grade_point);
            }
        });


        ComboBox<String> credits3 = new ComboBox<>();
        credits3.getItems().add("1");
        credits3.getItems().add("1.5");
        credits3.getItems().add("3");
        credits3.getItems().add("4");
        credits3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                credits_arr[2] = Double.parseDouble(credits3.getValue());
            }
        });


        //Course 4

        ComboBox<String> cb4 = new ComboBox<>();
        cb4.getItems().add("CSE115L");
        cb4.getItems().add("CSE173");
        cb4.getItems().add("CSE215");
        cb4.getItems().add("CSE215L");
        cb4.getItems().add("CSE225");
        cb4.getItems().add("CSE225L");
        cb4.getItems().add("CSE231");
        cb4.getItems().add("CSE231L");
        cb4.getItems().add("CSE299");
        cb4.getItems().add("CSE332");
        cb4.getItems().add("CSE311");
        cb4.getItems().add("CSE311L");
        cb4.getItems().add("CSE323");
        cb4.getItems().add("CSE327");
        cb4.getItems().add("CSE331");
        cb4.getItems().add("CSE331L");
        cb4.getItems().add("CSE425");
        cb4.getItems().add("CSE499A");
        cb4.getItems().add("CSE499B");
        cb4.getItems().add("ENG102");
        cb4.getItems().add("ENG103");
        cb4.getItems().add("ENG111");
        cb4.getItems().add("MAT116");
        cb4.getItems().add("MAT120");
        cb4.getItems().add("MAT125");
        cb4.getItems().add("MAT130");
        cb4.getItems().add("MAT250");
        cb4.getItems().add("MAT350");
        cb4.getItems().add("MAT361");
        cb4.getItems().add("HIS102");
        cb4.getItems().add("HIS103");
        cb4.getItems().add("CEE110");
        cb4.getItems().add("BEN205");
        cb4.getItems().add("PHI104");
        cb4.getItems().add("POL101");
        cb4.getItems().add("ECO101");
        cb4.getItems().add("BIO103");
        cb4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                course_arr[3] = cb4.getValue();
            }
        });



        ComboBox<String> grade4 = new ComboBox<>();
        grade4.getItems().add("A");
        grade4.getItems().add("A-");
        grade4.getItems().add("B+");
        grade4.getItems().add("B");
        grade4.getItems().add("B-");
        grade4.getItems().add("C+");
        grade4.getItems().add("C");
        grade4.getItems().add("C-");
        grade4.getItems().add("D+");
        grade4.getItems().add("D");
        grade4.getItems().add("F*");
        grade4.getItems().add("I");
        grade4.getItems().add("W");
        grade4.getItems().add("R");
        grade4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                grade_arr[3] = grade4.getValue();
                grade(3,grade_arr, grade_point);
            }
        });


        ComboBox<String> credits4 = new ComboBox<>();
        credits4.getItems().add("1");
        credits4.getItems().add("1.5");
        credits4.getItems().add("3");
        credits4.getItems().add("4");

        credits4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                credits_arr[3] = Double.parseDouble(credits4.getValue());
            }
        });


        //Course 5

        ComboBox<String> cb5 = new ComboBox<>();
        cb5.getItems().add("CSE115L");
        cb5.getItems().add("CSE173");
        cb5.getItems().add("CSE215");
        cb5.getItems().add("CSE215L");
        cb5.getItems().add("CSE225");
        cb5.getItems().add("CSE225L");
        cb5.getItems().add("CSE231");
        cb5.getItems().add("CSE231L");
        cb5.getItems().add("CSE299");
        cb5.getItems().add("CSE332");
        cb5.getItems().add("CSE311");
        cb5.getItems().add("CSE311L");
        cb5.getItems().add("CSE323");
        cb5.getItems().add("CSE327");
        cb5.getItems().add("CSE331");
        cb5.getItems().add("CSE331L");
        cb5.getItems().add("CSE425");
        cb5.getItems().add("CSE499A");
        cb5.getItems().add("CSE499B");
        cb5.getItems().add("ENG102");
        cb5.getItems().add("ENG103");
        cb5.getItems().add("ENG111");
        cb5.getItems().add("MAT116");
        cb5.getItems().add("MAT120");
        cb5.getItems().add("MAT125");
        cb5.getItems().add("MAT130");
        cb5.getItems().add("MAT250");
        cb5.getItems().add("MAT350");
        cb5.getItems().add("MAT361");
        cb5.getItems().add("HIS102");
        cb5.getItems().add("HIS103");
        cb5.getItems().add("CEE110");
        cb5.getItems().add("BEN205");
        cb5.getItems().add("PHI104");
        cb5.getItems().add("POL101");
        cb5.getItems().add("ECO101");
        cb5.getItems().add("BIO103");
        cb5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                course_arr[4] = cb5.getValue();
            }
        });



        ComboBox<String> grade5 = new ComboBox<>();
        grade5.getItems().add("A");
        grade5.getItems().add("A-");
        grade5.getItems().add("B+");
        grade5.getItems().add("B");
        grade5.getItems().add("B-");
        grade5.getItems().add("C+");
        grade5.getItems().add("C");
        grade5.getItems().add("C-");
        grade5.getItems().add("D+");
        grade5.getItems().add("D");
        grade5.getItems().add("F*");
        grade5.getItems().add("I");
        grade5.getItems().add("W");
        grade5.getItems().add("R");

        grade5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                grade_arr[4] = grade5.getValue();
                grade(4,grade_arr, grade_point);
            }
        });

        ComboBox<String> credits5 = new ComboBox<>();
        credits5.getItems().add("1");
        credits5.getItems().add("1.5");
        credits5.getItems().add("3");
        credits5.getItems().add("4");

        credits5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                credits_arr[4] = Double.parseDouble(credits5.getValue());
            }
        });



        hb.setMaxWidth(1920);
        hb.setMinWidth(1080);
        HBox first_Course = new HBox(20,tb_course1,cb1,credits,grade);
        HBox second_Course = new HBox(20, tb_course2,cb2, credits2,grade2);
        HBox third_Course = new HBox(20, tb_course3,cb3, credits3,grade3);
        HBox fourth_Course = new HBox(20, tb_course4,cb4, credits4,grade4);
        HBox fifth_Course = new HBox(20, tb_course5,cb5, credits5,grade5);


        Button submit_btn = new Button("Show CGPA");
        submit_btn.setMinSize(200,50);


        submit_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                File file = new File("Students.txt");
                try {


                    double sum=0;
                    double totalCr = credits_arr[0]+credits_arr[1]+credits_arr[2]+credits_arr[3]+credits_arr[4];
                    for (int count1=0; count1<5;count1++){
                        sum+=((credits_arr[count1])*(grade_point[count1]));
                    }

                    cgpa = (double) sum/ (double) totalCr;

                    file.createNewFile();
                    FileWriter fw = new FileWriter("Students.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    for(int count=0; count<5;count++) {

                        bw.write(course_arr[count]+" "+ credits_arr[count]+" "+grade_arr[count]+"\n");

                    }
                    bw.close();

                } catch (IOException e) {

                    e.printStackTrace();
                }



                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("CGPA");
                DecimalFormat df = new DecimalFormat("#.##");

                alert.setHeaderText("You CGPA is: ");
                alert.setContentText(String.valueOf(df.format(cgpa)));
                alert.show();
            }
        });


        VBox vb_course1 = new VBox(10,hb,hb_intro2,first_Course,second_Course,third_Course,fourth_Course,fifth_Course,submit_btn);



        Scene sc = new Scene(vb_course1,500,700);

        stage.setScene(sc);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}