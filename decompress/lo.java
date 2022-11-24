import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lo extends jo<String, Boolean>
{
    @Override
    public final Intent a(final Context context, final Object o) {
        final String s = (String)o;
        e0e.f((Object)context, "context");
        e0e.f((Object)s, "input");
        return ko.Companion.a(new String[] { s });
    }
    
    @Override
    public final a b(final Context context, final Object o) {
        final String s = (String)o;
        e0e.f((Object)context, "context");
        e0e.f((Object)s, "input");
        a a;
        if (qo6.a(context, s) == 0) {
            a = new a((T)Boolean.TRUE);
        }
        else {
            a = null;
        }
        return a;
    }
    
    @Override
    public final Object c(int i, final Intent intent) {
        Boolean b2;
        if (intent != null && i == -1) {
            final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean b = false;
            Label_0084: {
                if (intArrayExtra != null) {
                    final int length = intArrayExtra.length;
                    i = 0;
                    while (true) {
                        while (i < length) {
                            if (intArrayExtra[i] == 0) {
                                i = 1;
                                b = b;
                                if (i == 1) {
                                    b = true;
                                }
                                break Label_0084;
                            }
                            else {
                                ++i;
                            }
                        }
                        i = 0;
                        continue;
                    }
                }
            }
            b2 = b;
        }
        else {
            b2 = Boolean.FALSE;
        }
        return b2;
    }
}
