import java.util.Locale;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q9g
{
    public final String a;
    public final String b;
    public final int c;
    
    public q9g(final String a, final String... array) {
        final int length = array.length;
        String string;
        if (length == 0) {
            string = "";
        }
        else {
            final StringBuilder a2 = ta0.A('[');
            for (final String s : array) {
                if (a2.length() > 1) {
                    a2.append(",");
                }
                a2.append(s);
            }
            a2.append("] ");
            string = a2.toString();
        }
        this.b = string;
        this.a = a;
        new i99(a);
        int c;
        for (c = 2; c <= 7 && !Log.isLoggable(this.a, c); ++c) {}
        this.c = c;
    }
    
    public final void a(final String s, final Object... array) {
        if (this.c <= 3) {
            final String a = this.a;
            String format = s;
            if (array.length > 0) {
                format = String.format(Locale.US, s, array);
            }
            Log.d(a, this.b.concat(format));
        }
    }
    
    public final void b(final String s, final Object... array) {
        final String a = this.a;
        String format = s;
        if (array.length > 0) {
            format = String.format(Locale.US, s, array);
        }
        Log.e(a, this.b.concat(format));
    }
}
