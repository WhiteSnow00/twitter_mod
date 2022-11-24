import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v17 implements UncaughtExceptionHandler
{
    public final a a;
    public final tpp b;
    public final UncaughtExceptionHandler c;
    public final k17 d;
    public final AtomicBoolean e;
    
    public v17(final a a, final tpp b, final UncaughtExceptionHandler c, final k17 d) {
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
            int n4;
            int n5;
            int n6;
            final Exception ex;
            Label_0113_Outer:Block_9_Outer:
            while (true) {
                Label_0067: {
                    try {
                        if (this.a(thread, t)) {
                            ((v07)this.a).a(this.b, thread, t);
                            break Label_0096;
                        }
                        break Label_0067;
                    }
                    finally {
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
                        Label_0111: {
                            n5 = 0;
                        }
                        Label_0160: {
                            Block_8: {
                                while (true) {
                                    Label_0151: {
                                    Block_10_Outer:
                                        while (true) {
                                            break Label_0113;
                                        Label_0147_Outer:
                                            while (true) {
                                                break Label_0151;
                                            Block_11_Outer:
                                                while (true) {
                                                    iftrue(Label_0160:)(n6 == 0);
                                                    break Label_0151;
                                                    while (true) {
                                                        n6 = n;
                                                        continue Block_11_Outer;
                                                        Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", (Throwable)ex);
                                                        iftrue(Label_0145:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                                        continue Block_9_Outer;
                                                    }
                                                    Label_0145:
                                                    n6 = 0;
                                                    continue Block_11_Outer;
                                                }
                                                iftrue(Label_0096:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                                break Block_8;
                                                iftrue(Label_0160:)(n5 == 0);
                                                continue Label_0147_Outer;
                                            }
                                            n5 = n3;
                                            continue Block_10_Outer;
                                        }
                                    }
                                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (Throwable)null);
                                    break Label_0160;
                                    iftrue(Label_0111:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                    continue;
                                }
                            }
                            Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", (Throwable)null);
                            continue Label_0113_Outer;
                        }
                        this.c.uncaughtException(thread, t);
                        this.e.set(false);
                    }
                }
                break;
            }
        }
        catch (final Exception ex2) {}
    }
    
    public interface a
    {
    }
}
