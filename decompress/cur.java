import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cur<T extends vrd> implements otm<T>, itm<T>
{
    public final Object a(final Intent intent) {
        vrd vrd;
        if (intent != null) {
            final Object a = gmp.a(intent.getByteArrayExtra("extra_input_data"), (nmp)vrd.a);
            final int a2 = o5j.a;
            vrd = (vrd)a;
        }
        else {
            vrd = null;
        }
        return vrd;
    }
    
    @Override
    public final void b(final Intent intent, final Object o) {
        intent.putExtra("extra_input_data", gmp.e((Object)o, (nmp)vrd.a));
    }
}
