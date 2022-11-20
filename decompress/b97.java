import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.Context;
import android.net.Uri;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public class b97 extends jw0<Cursor>
{
    public final k2g$a O0;
    public Uri P0;
    public String[] Q0;
    public String R0;
    public String[] S0;
    public String T0;
    public Cursor U0;
    public sf3 V0;
    
    public b97(final Context context, final Uri p6, final String[] q0, final String r0, final String[] s0, final String t0) {
        super(context);
        this.O0 = new k2g$a((k2g)this);
        this.P0 = p6;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
    }
    
    @Deprecated
    public final void e(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.e(s, fileDescriptor, printWriter, array);
        printWriter.print(s);
        printWriter.print("mUri=");
        printWriter.println(this.P0);
        printWriter.print(s);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.Q0));
        printWriter.print(s);
        printWriter.print("mSelection=");
        printWriter.println(this.R0);
        printWriter.print(s);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.S0));
        printWriter.print(s);
        printWriter.print("mSortOrder=");
        printWriter.println(this.T0);
        printWriter.print(s);
        printWriter.print("mCursor=");
        printWriter.println(this.U0);
    }
    
    public final void j() {
        ((k2g)this).b();
        final Cursor u0 = this.U0;
        if (u0 != null && !u0.isClosed()) {
            this.U0.close();
        }
        this.U0 = null;
    }
    
    public final void l() {
        this.g();
    }
    
    public final void o() {
        synchronized (this) {
            final sf3 v0 = this.V0;
            if (v0 != null) {
                v0.a();
            }
        }
    }
    
    public final void s(final Object o) {
        final Cursor cursor = (Cursor)o;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
    
    public void t(final Cursor u0) {
        if (((k2g)this).I0) {
            if (u0 != null) {
                u0.close();
            }
            return;
        }
        final Cursor u2 = this.U0;
        this.U0 = u0;
        if (((k2g)this).G0) {
            super.d((Object)u0);
        }
        if (u2 != null && u2 != u0 && !u2.isClosed()) {
            u2.close();
        }
    }
}
