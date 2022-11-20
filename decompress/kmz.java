// 
// Decompiled by Procyon v0.6.0
// 

public final class kmz
{
    public String a;
    public Boolean b;
    public Integer c;
    
    public final smz a() {
        final String a = this.a;
        if (a != null) {
            final Boolean b = this.b;
            if (b != null) {
                if (this.c != null) {
                    return (smz)new omz(a, (boolean)b, (int)this.c);
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
        throw new IllegalStateException(ed.B(new StringBuilder(value.length() + 28), "Missing required properties:", value));
    }
}
