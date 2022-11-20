// 
// Decompiled by Procyon v0.6.0
// 

public final class c extends Error
{
    public static final int D0 = 0;
    
    public c(final c$a$a c$a$a, final long n) {
        super(jg9.s("Application Not Responding for at least ", n, " ms."), (Throwable)c$a$a);
    }
    
    public static String a(final Thread thread) {
        final StringBuilder sb = new StringBuilder();
        sb.append(thread.getName());
        sb.append(" (state = ");
        sb.append(thread.getState());
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
