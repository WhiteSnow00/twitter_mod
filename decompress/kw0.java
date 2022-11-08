// 
// Decompiled by Procyon v0.6.0
// 

public final class kw0
{
    public int a;
    public boolean b;
    
    public kw0() {
        this.a = 1;
    }
    
    public final void a() {
        synchronized (this) {
            if (!this.b && this.a != 4) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Mark COMPLETE. Invalid state: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            }
            this.a = 5;
        }
    }
}
