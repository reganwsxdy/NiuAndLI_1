package NewExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PojoCreator4j {

    public static void main(String[] args) {
        /**
         * 将Navicat软件打开，打开一个数据表，点开右侧的DDL，复制其中的sql语句，运行本代码即可获取其pojo类
         */
        String text = "CREATE TABLE \"medical_info\".\"st_settle_info\" (\n" +
                "  \"clinic_id\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"settle_id\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"clinic_num\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"settle_num\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"hospital_name\" varchar(200) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"hospital_id\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"insure_settle_level\" varchar(6) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"insure_id\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"bah\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"apply_day\" varchar(14) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"name\" varchar(50) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"sex\" varchar(3) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"birthday\" varchar(8) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"age\" varchar(4) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"country\" varchar(6) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"age_time\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"nation\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"certificate_type\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"certificate_num\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"occupation\" varchar(60) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"address\" varchar(200) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"company_name\" varchar(200) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"company_address\" varchar(200) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"company_tel\" varchar(20) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"post_code\" varchar(6) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"contact_name\" varchar(50) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"contact_relation\" varchar(6) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"contact_address\" varchar(200) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"contact_tel\" varchar(20) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"insure_type\" varchar(30) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"insure_place\" varchar(60) COLLATE \"pg_catalog\".\"default\" NOT NULL,\n" +
                "  \"special_person_type\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"neonatal_in_type\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"neonatal_birth_weight\" varchar(6) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"neonatal_in_weight\" varchar(6) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"oscd_diag_department\" varchar(6) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"oscd_diag_day\" varchar(8) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"in_hospital_type\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"in_hospital_way\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"treat_type\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"in_hospital_day\" varchar(14) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"in_hospital_department\" varchar(6) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"change_to_department\" varchar(6) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"leave_hospital_day\" varchar(14) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"leave_hospital_department\" varchar(60) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"real_ih_time\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"mm_diag_name\" varchar(200) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"mm_diag_code\" varchar(20) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"tcm_diag_name\" varchar(200) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"tcm_diag_code\" varchar(20) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"total_diag\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"total_operation\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"breath_machine_time\" varchar(10) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"tblpatient_pre_ih_time\" varchar(10) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"tblpatient_later_ih_time\" varchar(10) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"trans_blood_type\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"trans_blood_vol\" varchar(60) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"trans_blood_unit\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"special_care_time\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"first_care_time\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"second_care_time\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"third_care_time\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"leave_hospital_way\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"recv_org_name\" varchar(200) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"recv_org_code\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"bill_code\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"bill_num\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"business_num\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"leave_to_in_sign\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"leave_to_in_reason\" varchar(200) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"doctor_name\" varchar(50) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"doctor_code\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"settle_start_day\" varchar(8) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"settle_end_day\" varchar(8) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"account_pay\" varchar(20) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"no_account_pay\" varchar(20) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"per_account_pay\" varchar(20) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"per_cash_pay\" varchar(20) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"insure_pay_way\" varchar(30) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"insure_org\" varchar(100) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"insure_org_person\" varchar(50) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"hospital_department\" varchar(100) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"hospital_person\" varchar(50) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"address_pro\" varchar(255) COLLATE \"pg_catalog\".\"default\",\n" +
                "  \"company_address_pro\" varchar(255) COLLATE \"pg_catalog\".\"default\",\n" +
                "  CONSTRAINT \"settle_info_pkey\" PRIMARY KEY (\"settle_id\")\n" +
                ")\n" +
                ";";

        RegUtis();//加载初始化集合
        Matcher m = patternCompile.matcher(text); //具体匹配内容格式：「tel` varchar」

        while(m.find()){
            String[] preSplit = m.group(0).split("` "); //进一步将匹配的内容进行分割成 字段和类型的数据，例如：[id,int]
            String preText =preSplit[0];
            String preType =preSplit[1]; //类型

            if(Integerlist.contains(preType)) { //判断类型打印不同参数的属性成员字段
                System.out.println("private Integer "+preText+";");
            }else if(Stringlist.contains(preType)) {
                System.out.println("private String "+preText+";");
            }else if(Doublelist.contains(preType)) {
                System.out.println("private double "+preText+";");
            }else if(Datelist.contains(preType)) {
                System.out.println("private Date "+preText+";");
            }else{
                System.out.println("private String "+preText+";");
            }
        }
    }

    protected static Pattern patternCompile = Pattern.compile( //利用正在匹配所有可以匹配的字段
            "(?<=`).+(char|varchar|tinytext|text|blob|mediumtext|mediumblob|longtext|longblob|enum|set|"
                    + "tinyint|smallint|mediumint|int|bigint|decimal|float|double|"
                    + "datetime|date|timestamp|year|time)");

    protected static ArrayList<String> Integerlist =new ArrayList<String>(); //对字整数型封装
    protected static ArrayList<String> Stringlist =new ArrayList<String>(); //对字符串进行封装
    protected static ArrayList<String> Doublelist =new ArrayList<String>(); //对小数类型封装
    protected static ArrayList<String> Datelist =new ArrayList<String>(); //对日期进行封装

    protected static void RegUtis() { //给上面四个集合进行初始化赋值

        Collections.addAll(Integerlist,"tinyint|smallint|mediumint|int|bigint|decimal".split("\\|"));
        Collections.addAll(Stringlist,"charsize|varchar|tinytext|text|blob|mediumtext|mediumblob|longtext|longblob|enumxyzetc|enum|set".split("\\|"));
        Collections.addAll(Doublelist,"float|double".split("\\|"));
        Collections.addAll(Datelist,"datetime|date|timestamp|year|time".split("\\|"));
    }
}
