import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bej implements tsm<zdj>, zsm<zdj>
{
    public final /* bridge */ Object a(final Intent intent) {
        return this.c(intent);
    }
    
    public final void b(final Intent intent, final Object o) {
        final zdj zdj = (zdj)o;
        if (intent != null) {
            intent.putExtra("extra_result", klp.e((Object)zdj, (rlp)zdj.b));
        }
    }
    
    public final zdj c(final Intent intent) {
        if (intent == null) {
            return null;
        }
        return (zdj)klp.a(intent.getByteArrayExtra("extra_result"), (rlp)zdj.b);
    }
}
