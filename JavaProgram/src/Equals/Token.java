package Equals;

import java.util.Objects;

public class Token {
    private int age;
    private int weight;
    private int high;

    public Token() {

    }

    public Token(int age, int weight, int high) {
        this.age = age;
        this.weight = weight;
        this.high = high;
    }


    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Token)) {
            return false;
        }

        if(this == obj) {
            return true;
        }

        Token tk = (Token)obj;
        return this.age == tk.age && this.high == tk.high && this.weight == tk.weight;
    }

    //自动生成↓↓↓↓
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Token)) return false;
        Token token = (Token) o;
        return age == token.age && weight == token.weight && high == token.high;
    }
    */
}
