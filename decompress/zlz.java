import android.content.Context;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zlz extends mze<jjz, dkz>
{
    @Override
    public final Object a(final Object o) {
        final jjz jjz = (jjz)o;
        final rch c = rch.c();
        final Context b = rch.c().b();
        final ArrayList list = new ArrayList();
        if (jjz.c()) {
            list.add(new alz(b));
        }
        return new dkz(c.b(), (qyp)c.a(qyp.class), jjz.b());
    }
}
