// 
// Decompiled by Procyon v0.6.0
// 

public final class grl
{
    public xgh a;
    public s8a b;
    public srw c;
    public int d;
    public l63 e;
    
    public grl() {
        this.d = -1;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        }
        else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
