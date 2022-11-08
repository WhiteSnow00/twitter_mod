// 
// Decompiled by Procyon v0.6.0
// 

public final class fcz
{
    public String a;
    public Boolean b;
    public Integer c;
    
    public final ocz a() {
        final String a = this.a;
        if (a != null) {
            final Boolean b = this.b;
            if (b != null) {
                if (this.c != null) {
                    return new jcz(a, b, this.c);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" libraryName");
        }
        if (this.b == null) {
            sb.append(" enableFirelog");
        }
        if (this.c == null) {
            sb.append(" firelogEventType");
        }
        final String value = String.valueOf(sb);
        throw new IllegalStateException(hi.I(new StringBuilder(value.length() + 28), "Missing required properties:", value));
    }
}
