import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xgl implements itm<ygl>
{
    public final Object a(final Intent intent) {
        e0e.c((Object)intent);
        final long longExtra = intent.getLongExtra("user_id", 0L);
        int intExtra;
        if (intent.hasExtra("friendship")) {
            intExtra = intent.getIntExtra("friendship", 0);
        }
        else {
            intExtra = -1;
        }
        return new ygl(longExtra, intExtra);
    }
}
