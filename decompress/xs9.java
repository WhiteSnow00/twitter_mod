import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xs9
{
    public fhs a;
    public ix9 b;
    
    public xs9() {
        final bd0 a = cd0.a;
        Objects.requireNonNull(mis.Companion);
        final fhs a2 = new fhs(a, mis.b, null);
        this.a = a2;
        this.b = new ix9(a, a2.b);
    }
    
    public final fhs a(List<? extends hr9> b) {
        zzd.f(b, "editCommands");
        Object o = null;
        Object o2 = null;
        Label_0136: {
            try {
                final int size = ((List)b).size();
                int i = 0;
                o2 = null;
                while (i < size) {
                    try {
                        o = ((List)b).get(i);
                        try {
                            ((hr9)o).a(this.b);
                            ++i;
                            o2 = o;
                        }
                        catch (final Exception o2) {}
                    }
                    catch (final Exception ex) {
                        o = o2;
                        o2 = ex;
                        break Label_0136;
                    }
                    break;
                }
                o2 = new bd0(this.b.toString(), (List)null, 6);
                b = this.b;
                b = new fhs((bd0)o2, h6q.f(((ix9)b).b, ((ix9)b).c), this.b.d());
                return this.a = (fhs)b;
            }
            catch (final Exception ex2) {}
        }
        final StringBuilder sb = new StringBuilder();
        final StringBuilder g = w48.g("Error while applying EditCommand batch to buffer (length=");
        g.append(this.b.e());
        g.append(", composition=");
        g.append(this.b.d());
        g.append(", selection=");
        final ix9 b2 = this.b;
        g.append((Object)mis.j(h6q.f(b2.b, b2.c)));
        g.append("):");
        sb.append(g.toString());
        sb.append('\n');
        or4.L1((Iterable)b, (Appendable)sb, (CharSequence)"\n", (CharSequence)null, (CharSequence)null, (rtb)new ws9((hr9)o, this), 60);
        final String string = sb.toString();
        zzd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        throw new RuntimeException(string, (Throwable)o2);
    }
}
