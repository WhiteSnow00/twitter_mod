// 
// Decompiled by Procyon v0.6.0
// 

public abstract class u7k
{
    public static final int a = 0;
    
    static {
        final ob1$a ob1$a = new ob1$a();
        ob1$a.d(0L);
        ob1$a.b = 1;
        ob1$a.b(0L);
        ob1$a.a();
    }
    
    public abstract String a();
    
    public abstract long b();
    
    public abstract String c();
    
    public abstract String d();
    
    public abstract String e();
    
    public abstract int f();
    
    public abstract long g();
    
    public final boolean h() {
        return this.f() == 5;
    }
    
    public final boolean i() {
        final int c = ((ob1)this).c;
        boolean b = true;
        if (c != 2) {
            b = (c == 1 && b);
        }
        return b;
    }
    
    public final boolean j() {
        return this.f() == 4;
    }
    
    public abstract static class a
    {
    }
}
