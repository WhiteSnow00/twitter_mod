import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k17 implements UncaughtExceptionHandler
{
    public final a a;
    public final gop b;
    public final UncaughtExceptionHandler c;
    public final z07 d;
    public final AtomicBoolean e;
    
    public k17(final a a, final gop b, final UncaughtExceptionHandler c, final z07 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = new AtomicBoolean(false);
        this.d = d;
    }
    
    public final boolean a(final Thread thread, final Throwable t) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", (Throwable)null);
            return false;
        }
        if (t == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", (Throwable)null);
            return false;
        }
        final boolean b = this.d.b();
        boolean b2 = true;
        if (b) {
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                b2 = false;
            }
            if (b2) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", (Throwable)null);
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        final AtomicBoolean e = this.e;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 1;
        e.set(true);
        try {
            Label_0061: {
                try {
                    if (this.a(thread, t)) {
                        ((k07)this.a).a(this.b, thread, t);
                        break Label_0061;
                    }
                    break Label_0061;
                }
                finally {
                    int n4;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        n4 = n2;
                    }
                    else {
                        n4 = 0;
                    }
                    if (n4 != 0) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (Throwable)null);
                    }
                    this.c.uncaughtException(thread, t);
                    this.e.set(false);
                    int n5;
                    final Exception ex;
                    int n6;
                    Label_0112_Outer:Label_0153_Outer:
                    while (true) {
                        Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", (Throwable)null);
                        break Label_0061;
                        while (true) {
                            Label_0148: {
                                Block_10: {
                                    while (true) {
                                        iftrue(Label_0162:)(n5 == 0);
                                        break Block_10;
                                        iftrue(Label_0109:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                        Block_9: {
                                            break Block_9;
                                            Label_0109: {
                                                n5 = 0;
                                            }
                                            continue Label_0153_Outer;
                                            Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", (Throwable)ex);
                                            iftrue(Label_0145:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                            break Label_0112_Outer;
                                            Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (Throwable)null);
                                            Label_0162:
                                            this.c.uncaughtException(thread, t);
                                            this.e.set(false);
                                            return;
                                        }
                                        n5 = n3;
                                        continue Label_0153_Outer;
                                    }
                                    Label_0145: {
                                        n6 = 0;
                                    }
                                    break Label_0148;
                                }
                                continue;
                            }
                            iftrue(Label_0162:)(n6 == 0);
                            continue;
                        }
                        iftrue(Label_0093:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                        continue Label_0112_Outer;
                    }
                    n6 = n;
                }
            }
        }
        catch (final Exception ex2) {}
    }
    
    public interface a
    {
    }
}
