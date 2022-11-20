import java.util.Objects;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class mq1<T extends mq1<T>> extends kq1<T>
{
    public static final mq1.mq1$b Companion;
    
    static {
        Companion = new mq1.mq1$b();
    }
    
    public mq1(final Intent intent) {
        super(intent);
    }
    
    public abstract static class a<T extends mq1<T>, S extends a<T, S>> extends kq1$a<T, S>
    {
        public final S r(final vba vba) {
            czd.f((Object)vba, "refEventNamespace");
            final Intent a = ((xi1.a)this).a;
            czd.e((Object)a, "mIntent");
            Objects.requireNonNull(vba.Companion);
            a.putExtra("arg_referring_event_namespace", klp.e((Object)vba, (rlp)vba$b.b));
            return (S)this;
        }
    }
}
