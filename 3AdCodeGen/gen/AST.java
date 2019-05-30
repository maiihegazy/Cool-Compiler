import java.util.ArrayList;
import java.util.List;
public class AST{
    public static class ASTNode {
        int lineNo;
        void gen()
        {

        }
    }
    public static ArrayList<String> prog3AdCode = new ArrayList<>();
    public static int tCounter = 1;
    public static int lCounter = 1;
    public static String sp = "  ";


    public static class expression extends ASTNode {
        String type;
        public String v = "unintialized";
        public expression(){
            type = "_no_type";
        }
        String getString(String space){
            return "";
        }
        int eval(){
            return -999999;
        }

        String getV(){
            return v;
        }
    }
    public static class no_expr extends expression {
        public no_expr(int l){
            lineNo = l;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_no_expr\n"+space+": "+type;
        }

    }
    public static class bool_const extends expression{
        public boolean value;
        public bool_const(boolean v, int l){
            value = v;
            lineNo = l;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_bool\n"+space+sp+(value?"1":"0")+"\n"+space+": "+type;
        }
        void gen(){
        }
    }
    public static class string_const extends expression{
        public String value;
        public string_const(String v, int l){
            value = v;
            lineNo = l;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_string\n"+space+sp+"\""+value+"\""+"\n"+space+": "+type;
        }
        void gen(){
        }

        @Override
        String getV(){
            return value;
        }
    }

    public static class int_const extends expression{
        public int value;
        public int_const(int v, int l){
            value = v;
            lineNo = l;

        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_int\n"+space+sp+value+"\n"+space+": "+type;
        }
        int eval(){
            return value;
        }
        void gen(){

        }
        @Override
        String getV(){
            return String.valueOf(value);
        }
    }

    public static class object extends expression{
        public String name;
        public object(String v, int l){
            name = v;
            lineNo = l;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_object\n"+space+sp+name+"\n"+space+": "+type;
        }
        void gen(){

        }
        @Override
        String getV(){
            return name;
        }
    }
    public static class comp extends expression{
        public expression e1;
        public comp(expression v, int l){
            e1 = v;
            lineNo = l;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_comp\n"+e1.getString(space+sp)+"\n"+space+": "+type;
        }
    }
    public static class eq extends expression{
        public expression e1;
        public expression e2;
        public String v;
        public eq(expression v1, expression v2, int l){
            e1=v1;
            e2=v2;
            lineNo = l;
            v = "t" + tCounter++;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_eq\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + "=" + " " + e2.getV();

            prog3AdCode.add(command);
        }
        @Override
        String getV(){
            return v;
        }
    }


    public static class leq extends expression{
        public expression e1;
        public expression e2;
        public String v;
        public leq(expression v1, expression v2, int l){
            e1 = v1;
            e2 = v2;
            lineNo = l;
            v = "t" + tCounter++;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_leq\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + "<=" + " " + e2.getV();

            prog3AdCode.add(command);
        }
        @Override
        String getV(){
            return v;
        }
    }

    public static class lt extends expression{
        public expression e1;
        public expression e2;
        public String v;
        public lt(expression v1, expression v2, int l){
            e1 = v1;
            e2 = v2;
            lineNo = l;
            v = "t" + tCounter++;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_lt\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + "<" + " " + e2.getV();

            prog3AdCode.add(command);
        }
        @Override
        String getV(){
            return v;
        }
    }
    public static class neg extends expression{
        public expression e;
        public String v;
        public neg(expression v1, int l){
            e = v1;
            lineNo = l;
            v = "t" + tCounter++;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_neg\n"+e.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            e.gen();
            String command = v + " = " + "!" + " " + e.getV();
            prog3AdCode.add(command);
        }
        @Override
        String getV(){
            return v;
        }
    }
    public static class divide extends expression{
        public expression e1;
        public expression e2;
        public String v;
        int res;
        public divide(expression v1, expression v2, int l){
            e1 = v1;
            e2 = v2;
            res = this.eval();
            v = "t" + tCounter++;
            System.out.println(">>> " +v);
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_divide\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
        }
        int eval(){
            return e1.eval() / e2.eval();
        }
        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + "/" + " " + e2.getV();

            prog3AdCode.add(command);


        }
        @Override
        String getV(){
            return v;
        }
    }
    public static class mul extends expression{
        public expression e1;
        public expression e2;
        public String v;
        int res;
        public mul(expression v1, expression v2, int l){
            e1 = v1;
            e2 = v2;
            lineNo = l;
            res = this.eval();
            v = "t" + tCounter++;
//            System.out.println(">>> " +v);
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_mul\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
        }
        int eval(){
            return e1.eval() * e2.eval();
        }
        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + "*" + " " + e2.getV();

            prog3AdCode.add(command);


        }
        @Override
        String getV(){
            return v;
        }
    }
    public static class sub extends expression{
        public expression e1;
        public expression e2;
        public String v;
        int res;
        public sub(expression v1, expression v2, int l){
            e1 = v1;
            e2 = v2;
            lineNo = l;
            res = this.eval();
            v = "t" + tCounter++;
//            System.out.println(">>> " +v);
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_sub\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
        }
        int eval(){
            return e1.eval() - e2.eval();
        }
        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + "-" + " " + e2.getV();

            prog3AdCode.add(command);


        }
        @Override
        String getV(){
            return v;
        }
    }
    public static class plus extends expression{
        public expression e1;
        public expression e2;
        public String v;
        int res;
        public plus(expression v1, expression v2, int l){
            e1 = v1;
            e2 = v2;
            lineNo = l;
            res = this.eval();
            v = "t" + tCounter++;
//            System.out.println(">>> " +v);
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_plus\n"+e1.getString(space+sp)+"\n"+e2.getString(space+sp)+"\n"+space+": "+type;
        }
        int eval(){
            return e1.eval() + e2.eval();
        }
        void gen(){
            e1.gen();
            e2.gen();
            String command = v + " = " + e1.getV() + " " + "+" + " " + e2.getV();

            prog3AdCode.add(command);


        }
        @Override
        String getV(){
            return v;
        }
    }
    public static class isvoid extends expression{
        public expression e1;
        public String v;
        public isvoid(expression v1, int l){
            e1 = v1;
            lineNo = l;
            v = "t" + tCounter++;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_isvoid\n"+e1.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            e1.gen();
            String command = v + " = " + e1.getV() + " == NULL";
            prog3AdCode.add(command);
        }

        @Override
        String getV(){
            return v;
        }
    }
    public static class new_ extends expression{
        public String typeid;
        public new_(String t, int l){
            typeid = t;
            lineNo = l;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_new\n"+space+sp+typeid+"\n"+space+": "+type;
        }
    }
    public static class assign extends expression{
        public String name;
        public expression e1;
        public assign(String n, expression v1, int l){
            name = n;
            e1 = v1;
            lineNo = l;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_assign\n"+space+sp+name+"\n"+e1.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            e1.gen();
            if(e1.getV().equals("uninitialized")){ System.out.println("blablalbla");}
            prog3AdCode.add(name + " = " + e1.getV() );
        }

        @Override
        String getV(){
            return name;
        }
    }
    public static class block extends expression{
        ArrayList<AST.expression> exprs;
        String v;

        public block(ArrayList<expression> exprs,int l){
            this.exprs = exprs;
            lineNo = l;
            v = "t" + tCounter++;
        }
        String getString(String space){
            String str = space+"#"+lineNo+"\n"+space+"_block\n";
            for (expression e1 : exprs){
                str += e1.getString(space+sp)+"\n";
            }
            str+=space+": "+type;
            return str;
        }
        void gen(){
            expression last = new expression();

            for(expression e: exprs){
                e.gen();
                last = e;
            }

            prog3AdCode.add(v + " = " + last.getV());
        }
        @Override
        String getV(){
            return v;
        }

    }
    public static class loop extends expression{
        public expression predicate;
        public expression body;
        String before, after;
        public loop(expression v1, expression v2, int l){
            predicate = v1;
            body = v2;
            lineNo = l;
            before = "BEFORE" + lCounter;
            after = "AFTER" + lCounter++;
        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_loop\n"+predicate.getString(space+sp)+"\n"+body.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            prog3AdCode.add(before + ": ");
            predicate.gen();
            prog3AdCode.add("ifFalse " + predicate.getV() + " goto " + after);
            body.gen();
            prog3AdCode.add("goto " + before);
            prog3AdCode.add(after + ": ");
        }
    }
    public static class cond extends expression{
        public expression predicate;
        public expression ifbody;
        public expression elsebody;
        String before_else, after_else;
        public cond(expression v1, expression v2, expression v3, int l){
            predicate = v1;
            ifbody = v2;
            elsebody = v3;
            lineNo = l;
            before_else = "BEFORE" + lCounter;
            after_else = "AFTER" + lCounter++;

        }
        String getString(String space){
            return space+"#"+lineNo+"\n"+space+"_cond\n"+predicate.getString(space+sp)+"\n"+ifbody.getString(space+sp)+"\n"+elsebody.getString(space+sp)+"\n"+space+": "+type;
        }
        void gen(){
            predicate.gen();
            prog3AdCode.add("ifFalse " + predicate.getV() + " goto " + before_else);
            ifbody.gen();
            prog3AdCode.add("goto " + after_else);
            prog3AdCode.add(before_else + ": ");
            elsebody.gen();
            prog3AdCode.add(after_else + ": ");
//         prog3AdCode.add( Integer.toString(v));
        }

        @Override
        String getV(){
            return v;
        }
    }

//    public static class let extends expression{
//        expression e;
//        ArrayList<expression> exprs;
//        ArrayList<String> ids;
//        ArrayList<Boolean> flags;
//        String type;
//        public String v;
//
//        public let(ArrayList<Boolean> flags, ArrayList<String> ids, ArrayList<expression> exprs, expression e){
//            this.exprs = exprs;
//            this.flags = flags;
//            this.ids = ids;
//            this.e = e;
//            type = "LET";
//            v = "t" + tCounter++;
//        }
//
//        String getString(String space){
//            return space + "Expression: type:" + type + "\n";
//        }
//
//        void gen(){
//            int po = 0;
//            for (AST.expression it : exprs){
//                if(flags.get(po)){
//                    it.gen();
//                    prog3AdCode.add(ids.get(po) + " = " + it.getV());
//                }
//                po++;
//            }
//
//            e.gen();
//            prog3AdCode.add(v + " = " + e.getV());
//        }
//
//        @Override
//        String getV(){
//            return v;
//        }
//
//    }

    public static class let extends expression {
    public String name;
    public String typeid;
    public expression value;
    public expression body;

    public let(String n, String t, expression v, expression b, int l) {
        name = n;
        typeid = t;
        value = v;
        body = b;
    }

    String getString(String space) {
        return space + "#" + lineNo + "\n" + space + "_let\n" + space + sp + name + "\n" + space + sp + typeid + "\n" + value.getString(space + sp) + "\n" + body.getString(space + sp) + "\n" + space + ": " + type;
    }
}
    public static class dispatch extends expression {
        public expression caller;
        public String name;
        public List<expression> actuals;

        public dispatch(expression v1, String n, List<expression> a, int l) {
            caller = v1;
            name = n;
            actuals = a;
            lineNo = l;
        }

        String getString(String space) {
            String str;
            str = space + "#" + lineNo + "\n" + space + "_dispatch\n" + caller.getString(space + sp) + "\n" + space + sp + name + "\n" + space + sp + "(\n";
            for (expression e1 : actuals) {
                str += e1.getString(space + sp) + "\n";
            }
            str += space + sp + ")\n" + space + ": " + type;
            return str;
        }
        void gen(){
            for (expression e1 : actuals) {
                prog3AdCode.add("PushParams " + e1.getV());
            }
            prog3AdCode.add("Call " + name);
            prog3AdCode.add("PopParams "+ actuals.size()*4);
                   }
        @Override
        String getV(){
            return name;
        }

    }

    public static class static_dispatch extends expression {
        public expression caller;
        public String typeid;
        public String name;
        public List<expression> actuals;

        public static_dispatch(expression v1, String t, String n, List<expression> a, int l) {
            caller = v1;
            typeid = t;
            name = n;
            actuals = a;
            lineNo = l;
        }

        String getString(String space) {
            String str;
            str = space + "#" + lineNo + "\n" + space + "_static_dispatch\n" + caller.getString(space + sp) + "\n" + space + sp + typeid + "\n" + space + sp + name + "\n" + space + sp + "(\n";
            for (expression e1 : actuals) {
                str += e1.getString(space + sp) + "\n";
            }
            str += space + sp + ")\n" + space + ": " + type;
            return str;
        }
    }

    public static class typcase extends expression {
        public expression predicate;
        public List<branch> branches;

        public typcase(expression p, List<branch> b, int l) {
            predicate = p;
            branches = b;
            lineNo = l;
        }

        String getString(String space) {
            String str = space + "#" + lineNo + "\n" + space + "_typcase\n" + predicate.getString(space + sp) + "\n";
            for (branch b1 : branches) {
                str += b1.getString(space + sp) + "\n";
            }
            str += space + ": " + type;
            return str;
        }

        void gen() {
        }

        @Override
        String getV() {
            return "NULL";
        }
    }

    public static class branch extends ASTNode {
        public String name;
        public String type;
        public expression value;

        public branch(String n, String t, expression v, int l) {
            name = n;
            type = t;
            value = v;
            lineNo = l;
        }

        String getString(String space) {
            return space + "#" + lineNo + "\n" + space + "_branch\n" + space + sp + name + "\n" + space + sp + type + "\n" + value.getString(space + sp);
        }
    }

    public static class formal extends ASTNode {
        public String name;
        public String typeid;

        public formal(String n, String t, int l) {
            name = n;
            typeid = t;
            lineNo = l;
        }

        String getString(String space) {
            return space + "#" + lineNo + "\n" + space + "_formal\n" + space + sp + name + "\n" + space + sp + typeid;
        }

        void gen() {

        }
    }



    public static class method extends feature {
        public String name;
        public List<formal> formals;
        public String typeid;
        public expression body;
        public method(String n, List<formal> f, String t, expression b, int l){
            name = n;
            formals = f;
            typeid = t;
            body = b;
            lineNo = l;

        }
        String getString(String space){
            String str = space+"#"+lineNo+"\n"+space+"_method\n"+space+sp+name+"\n";
            for ( formal f : formals ) {
                str += f.getString(space+sp)+"\n";
            }
            str += space+sp+typeid+"\n"+body.getString(space+sp);
            return str;
        }
        void gen(){

                prog3AdCode.add(name + ":" );
                prog3AdCode.add("BeginFun " );
            for ( formal f : formals ) {
                prog3AdCode.add("PushParams "+ f.name);
            }

                body.gen();
                prog3AdCode.add("EndFun ");
//                return;


        }

        String getV(){
            return typeid;
        }
    }

    public static class attr extends feature {
        public String name;
        public String typeid;
        public expression value;
        Boolean flag = false;

        public attr(String n, String t, expression v, int l) {
            name = n;
            typeid = t;
            value = v;
            lineNo = l;

            flag = true;
        }

        String getString(String space) {
            return space + "#" + lineNo + "\n" + space + "_attr\n" + space + sp + name + "\n" + space + sp + typeid + "\n" + value.getString(space + sp);
        }

        void gen() {
            if (flag) {
                value.gen();
//                System.out.println("ana f atrr gen");
                if(value.getV()!="uninitialized")
                prog3AdCode.add(name + " = " + value.getV());
            }
        }

        String getV() {
            return name;
        }
    }

    public static class class_ extends ASTNode {
        public String name;
        public String filename;
        public String parent;
        public List<feature> features;

        public class_(String n, String f, String p, List<feature> fs, int l) {
            name = n;
            filename = f;
            parent = p;
            features = fs;
            lineNo = l;
        }

        String getString(String space) {
            String str;
            str = space + "#" + lineNo + "\n" + space + "_class\n" + space + sp + name + "\n" + space + sp + parent + "\n" + space + sp + "\"" + filename + "\"" + "\n" + space + sp + "(\n";
            for (feature f : features) {
                str += f.getString(space + sp) + "\n";
            }
            str += space + sp + ")";
            return str;
        }

        void gen() {
            for (feature f : features) {
                f.gen();
//                System.out.println("Ana f c. Gen");

            }
        }
    }

    public static class program extends ASTNode {
        public List<class_> classes;

        public program(List<class_> c, int l) {
            classes = c;
            lineNo = l;
        }

        String getString(String space) {
            String str;
            str = space + "#" + lineNo + "\n" + space + "_program";
            for (class_ c : classes) {
                str += "\n" + c.getString(space + sp);
            }

            return str;
        }

        void gen() {
            for (AST.class_ c : classes) {
                c.gen();
//                System.out.println("Ana f awl Gen gwa el for loop");
            }
//            System.out.println("Ana f awl Gen");
        }
    }
    public static class feature extends ASTNode {
//        public feature() {
//            System.out.println("claaaas");
//        }

        String getString(String space) {
            return space + "feature";
        }

        void gen() {
//            System.out.println("claaaas3333");
        }

    }
}