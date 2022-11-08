import android.content.res.TypedArray;
import android.view.View;
import android.os.BaseBundle;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import androidx.emoji2.text.c;
import java.nio.channels.FileChannel;
import android.widget.TextView;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.util.AttributeSet;
import java.util.concurrent.Executor;
import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.text.method.KeyListener;
import java.util.Objects;
import java.nio.channels.FileLock;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.widget.EditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jk0 implements zo6, ahj, wqy
{
    public final Object C0 = c0;
    public final Object D0 = "notes";
    
    public static jk0 b(Context ex) {
        Object channel = null;
        FileLock lock = null;
        Label_0086: {
            try {
                ex = (OverlappingFileLockException)new RandomAccessFile(new File(((Context)ex).getFilesDir(), "generatefid.lock"), "rw");
                channel = ((RandomAccessFile)ex).getChannel();
                try {
                    lock = ((FileChannel)channel).lock();
                    try {
                        return new jk0(channel, lock);
                    }
                    catch (final OverlappingFileLockException ex) {}
                    catch (final Error ex) {}
                    catch (final IOException ex) {}
                }
                catch (final OverlappingFileLockException ex) {}
                catch (final Error ex) {}
                catch (final IOException ex2) {}
                lock = null;
                break Label_0086;
            }
            catch (final OverlappingFileLockException ex) {}
            catch (final Error ex) {}
            catch (final IOException ex3) {}
            channel = (lock = null);
        }
        Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", (Throwable)ex);
        if (lock != null) {
            try {
                lock.release();
            }
            catch (final IOException ex4) {}
        }
        Label_0115: {
            if (channel == null) {
                break Label_0115;
            }
            try {
                ((AbstractInterruptibleChannel)channel).close();
                return null;
            }
            catch (final IOException ex5) {
                return null;
            }
        }
    }
    
    public static void h(final jk0 jk0, final q1v q1v, String s, String s2, final String s3, int n) {
        boolean b = true;
        final boolean b2 = (n & 0x2) != 0x0;
        final String s4 = "";
        if ((n & 0x4) != 0x0) {
            s = "";
        }
        if ((n & 0x8) != 0x0) {
            s2 = "";
        }
        Objects.requireNonNull(jk0);
        final b4v d = q1v.d;
        Label_0106: {
            if (d != null) {
                final hfv a = d.a;
                if (a != null && a.C0 == ((UserIdentifier)jk0.C0).getId()) {
                    n = 1;
                    break Label_0106;
                }
            }
            n = 0;
        }
        String s5;
        if (n != 0) {
            s5 = "me";
        }
        else {
            s5 = "profile";
        }
        final zf4 zf4 = new zf4(nca.Companion.e(s5, (String)jk0.D0, s, s2, s3));
        final b4v d2 = q1v.d;
        s = null;
        hfv a2;
        if (d2 != null) {
            a2 = d2.a;
        }
        else {
            a2 = null;
        }
        final boolean b3 = a2 != null && tdy.d0(a2.H1);
        if (a2 == null || !tdy.e0(a2.H1)) {
            b = false;
        }
        final lev$a lev$a = new lev$a();
        lev$a.T0 = b3;
        lev$a.S0 = b;
        if (a2 != null) {
            s = a2.e();
        }
        lev$a.p1 = s;
        if (b2) {
            final a8v.a a3 = new a8v.a();
            s = s4;
            if (a2 != null) {
                s = a2.e();
                if (s == null) {
                    s = s4;
                }
            }
            a3.a = s;
            a3.o(q1v.a);
            a3.c = b3;
            a3.d = b;
            lev$a.o1 = (a8v)a3.e();
        }
        zf4.i((szo)((h4j)lev$a).e());
        saw.b((okm)zf4);
    }
    
    public final KeyListener c(final KeyListener keyListener) {
        Object o = keyListener;
        if (keyListener instanceof NumberKeyListener ^ true) {
            Objects.requireNonNull(((g1a)this.D0).a);
            if (keyListener instanceof m1a) {
                o = keyListener;
            }
            else if (keyListener == null) {
                o = null;
            }
            else if (keyListener instanceof NumberKeyListener) {
                o = keyListener;
            }
            else {
                o = new m1a(keyListener);
            }
        }
        return (KeyListener)o;
    }
    
    public final Object d(zas u) {
        final klo klo = (klo)this.C0;
        final Bundle bundle = (Bundle)this.D0;
        Objects.requireNonNull(klo);
        if (u.s()) {
            final Bundle bundle2 = (Bundle)u.o();
            if (bundle2 != null && ((BaseBundle)bundle2).containsKey("google.messenger")) {
                u = klo.a(bundle).u((Executor)w000.C0, (atr)ajy.O0);
            }
        }
        return u;
    }
    
    public final void e(AttributeSet obtainStyledAttributes, final int n) {
        obtainStyledAttributes = (AttributeSet)((View)this.C0).getContext().obtainStyledAttributes(obtainStyledAttributes, ck1.N0, n, 0);
        try {
            final boolean hasValue = ((TypedArray)obtainStyledAttributes).hasValue(14);
            boolean boolean1 = true;
            if (hasValue) {
                boolean1 = ((TypedArray)obtainStyledAttributes).getBoolean(14, true);
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.j(boolean1);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final InputConnection f(InputConnection inputConnection, final EditorInfo editorInfo) {
        final g1a g1a = (g1a)this.D0;
        Objects.requireNonNull(g1a);
        if (inputConnection == null) {
            inputConnection = null;
        }
        else {
            final g1a$a a = g1a.a;
            Objects.requireNonNull(a);
            if (!(inputConnection instanceof k1a)) {
                inputConnection = (InputConnection)new k1a((TextView)a.a, inputConnection, editorInfo);
            }
        }
        return inputConnection;
    }
    
    public final void g() {
        try {
            ((FileLock)this.D0).release();
            ((FileChannel)this.C0).close();
        }
        catch (final IOException ex) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", (Throwable)ex);
        }
    }
    
    public final void i(final q1v q1v, final String s, final String s2) {
        h(this, q1v, "overflow_menu", s, s2, 2);
    }
    
    public final void j(final boolean f0) {
        final u1a b = ((g1a)this.D0).a.b;
        if (b.F0 != f0) {
            if (b.E0 != null) {
                final c a = c.a();
                final u1a$a e0 = b.E0;
                Objects.requireNonNull(a);
                ri4.r((Object)e0, (Object)"initCallback cannot be null");
                a.a.writeLock().lock();
                try {
                    a.b.remove((Object)e0);
                }
                finally {
                    a.a.writeLock().unlock();
                }
            }
            b.F0 = f0;
            if (f0) {
                u1a.a(b.C0, c.a().b());
            }
        }
    }
    
    public final void p(final zas zas) {
        ((p0y)this.D0).b.remove(this.C0);
    }
}
