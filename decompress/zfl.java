import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfl implements bsm<agl>
{
    @Override
    public final Object c(final Intent intent) {
        zzd.c((Object)intent);
        final long longExtra = intent.getLongExtra("user_id", 0L);
        int intExtra;
        if (intent.hasExtra("friendship")) {
            intExtra = intent.getIntExtra("friendship", 0);
        }
        else {
            intExtra = -1;
        }
        return new agl(longExtra, intExtra);
    }
}
