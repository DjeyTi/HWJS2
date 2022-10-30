package HW5.Calc;

public abstract class CalcModel implements Model {
    Object x;
    Object y;
}

interface Model {
    String result(String arg1, String arg2);

    Double result(Double arg1, Double arg2);    
}

class Sum extends CalcModel {
    Sum(Object arg1, Object arg2) {
        super.x = arg1;
        super.y = arg2;
    }

    @Override
    public String result(String arg1, String arg2) {
        String[] a = x.toString().split(" "); // a + bi
        String[] b = y.toString().split(" "); // a + bi
        double first = Double.parseDouble(a[0]) + Double.parseDouble(b[0]);
        a[2] = a[2].replace("i", "");
        b[2] = b[2].replace("i", "");
        double secondA = Double.parseDouble(a[2]);
        double secondB = Double.parseDouble(b[2]);
        double second;
        if (a[1].contains("-")) 
            secondA = -secondA;
        if (b[1].contains("-")) 
            secondB = -secondB;
        second = secondA + secondB;
        String answer = "";
        if (second < 0) {
            answer = Double.toString(first) + " - " + Double.toString(-second) + "i";
        } else {
            answer = Double.toString(first) + " + " + Double.toString(second) + "i";
        }
        return answer;
    }

    @Override
    public Double result(Double arg1, Double arg2) {
        return arg1 + arg2;
    }
}

class Sub extends CalcModel {
    Sub(Object arg1, Object arg2) {
        super.x = arg1;
        super.y = arg2;
    }

    @Override
    public String result(String arg1, String arg2) {
        String[] a = x.toString().split(" "); // a + bi
        String[] b = y.toString().split(" "); // a + bi
        double first = Double.parseDouble(a[0]) - Double.parseDouble(b[0]);
        a[2] = a[2].replace("i", "");
        b[2] = b[2].replace("i", "");
        double secondA = Double.parseDouble(a[2]);
        double secondB = Double.parseDouble(b[2]);
        double second;
        if (a[1].contains("-")) 
            secondA = -secondA;
        if (b[1].contains("-")) 
            secondB = -secondB;
        second = secondA - secondB;
        String answer = "";
        if (second < 0) {
            answer = Double.toString(first) + " - " + Double.toString(-second) + "i";
        } else {
            answer = Double.toString(first) + " + " + Double.toString(second) + "i";
        }
        return answer;
    }

    @Override
    public Double result(Double arg1, Double arg2) {
        return arg1 - arg2;
    }
}

class Div extends CalcModel {
    Div(Object arg1, Object arg2) {
        super.x = arg1;
        super.y = arg2;
    }

    @Override
    public String result(String arg1, String arg2) {
        String[] a = x.toString().split(" "); // a + bi
        String[] b = y.toString().split(" "); // a + bi
        double firstA = Double.parseDouble(a[0]);
        double firstB = Double.parseDouble(b[0]);
        a[2] = a[2].replace("i", "");
        b[2] = b[2].replace("i", "");
        double secondA = Double.parseDouble(a[2]);
        double secondB = Double.parseDouble(b[2]);
        if (a[1].contains("-")) 
            secondA = -secondA;
        if (b[1].contains("-")) 
            secondB = -secondB;
        double first = firstA*firstB + secondA*secondB;
        double second = secondA*firstB + firstA*secondB;
        double third = secondA*secondA + secondB*secondB;
        String answer = "";
        if (second < 0) {
            answer = "(" + Double.toString(first) + " - " + Double.toString(-second) + "i) / " + third;
        } else {
            answer = "(" + Double.toString(first) + " + " + Double.toString(second) + "i) / " + third;
        }
        return answer;
    }

    @Override
    public Double result(Double arg1, Double arg2) {
        return arg1 / arg2;
    }
}

class Mult extends CalcModel {
    Mult(Object arg1, Object arg2) {
        super.x = arg1;
        super.y = arg2;
    }

    @Override
    public String result(String arg1, String arg2) {
        String[] a = x.toString().split(" "); // a + bi
        String[] b = y.toString().split(" "); // a + bi
        double firstA = Double.parseDouble(a[0]);
        double firstB = Double.parseDouble(b[0]);
        a[2] = a[2].replace("i", "");
        b[2] = b[2].replace("i", "");
        double secondA = Double.parseDouble(a[2]);
        double secondB = Double.parseDouble(b[2]);
        if (a[1].contains("-")) 
            secondA = -secondA;
        if (b[1].contains("-")) 
            secondB = -secondB;
        double first = firstA*firstB - secondA*secondB;
        double second = secondA*firstB + firstA*secondB;
        String answer = "";
        if (second < 0) {
            answer = Double.toString(first) + " - " + Double.toString(-second) + "i";
        } else {
            answer = Double.toString(first) + " + " + Double.toString(second) + "i";
        }
        return answer;
    }

    @Override
    public Double result(Double arg1, Double arg2) {
        return arg1 * arg2;
    }
    
}