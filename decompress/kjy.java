import android.util.Log;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$a;
import com.google.android.gms.dynamite.DynamiteModule;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.SystemClock;
import android.os.RemoteException;
import com.google.mlkit.common.MlKitException;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjy implements biz
{
    public final Context a;
    public final cks b;
    public boolean c;
    public boolean d;
    public gqz e;
    
    public kjy(final Context a, final cks b) {
        this.a = a;
        this.b = b;
    }
    
    public final cfs a(final yrd yrd) throws MlKitException {
        if (this.e == null) {
            this.c();
        }
        final gqz e = this.e;
        Objects.requireNonNull(e, "null reference");
        if (!this.c) {
            try {
                e.U0(1, e.s());
                this.c = true;
            }
            catch (final RemoteException ex) {
                final String value = String.valueOf(this.b.a());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to init text recognizer ".concat(value);
                }
                else {
                    concat = new String("Failed to init text recognizer ");
                }
                throw new MlKitException(concat, (Throwable)ex);
            }
        }
        final bqz bqz = new bqz(yrd.e, yrd.b, yrd.c, yx4.a(yrd.d), SystemClock.elapsedRealtime());
        Objects.requireNonNull(p9d.b);
        final int e2 = yrd.e;
        final rrz rrz = null;
        Label_0232: {
            if (e2 != -1) {
                if (e2 != 17) {
                    if (e2 == 35) {
                        final p5j p5j = new p5j(null);
                        break Label_0232;
                    }
                    if (e2 != 842094169) {
                        throw new MlKitException(go9.p(37, "Unsupported image format: ", yrd.e), 3);
                    }
                }
                Objects.requireNonNull((Object)null, "null reference");
                throw null;
            }
            final Bitmap a = yrd.a;
            Objects.requireNonNull(a, "null reference");
            final p5j p5j = new p5j(a);
            try {
                final Parcel s = e.s();
                eoy.a(s, (IInterface)p5j);
                s.writeInt(1);
                bqz.writeToParcel(s, 0);
                final Parcel x = e.x(3, s);
                final Parcelable$Creator<rrz> creator = rrz.CREATOR;
                Object o;
                if (x.readInt() == 0) {
                    o = rrz;
                }
                else {
                    o = creator.createFromParcel(x);
                }
                final rrz rrz2 = (rrz)o;
                x.recycle();
                return new cfs(rrz2);
            }
            catch (final RemoteException ex2) {
                final String value2 = String.valueOf(this.b.a());
                String concat2;
                if (value2.length() != 0) {
                    concat2 = "Failed to run text recognizer ".concat(value2);
                }
                else {
                    concat2 = new String("Failed to run text recognizer ");
                }
                throw new MlKitException(concat2, (Throwable)ex2);
            }
        }
    }
    
    public final void c() throws MlKitException {
        if (this.e == null) {
            try {
                final Context a = this.a;
                Object o;
                if (this.b.b()) {
                    o = DynamiteModule.c;
                }
                else {
                    o = DynamiteModule.b;
                }
                final IBinder b = DynamiteModule.c(a, (DynamiteModule$a)o, this.b.d()).b(this.b.f());
                final int a2 = mqz.a;
                oqz oqz;
                if (b == null) {
                    oqz = null;
                }
                else {
                    final IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    if (queryLocalInterface instanceof oqz) {
                        oqz = (oqz)queryLocalInterface;
                    }
                    else {
                        oqz = new jqz(b);
                    }
                }
                this.e = oqz.a1((l3d)new p5j(this.a));
            }
            catch (final RemoteException ex) {
                final String value = String.valueOf(this.b.a());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to create text recognizer ".concat(value);
                }
                else {
                    concat = new String("Failed to create text recognizer ");
                }
                throw new MlKitException(concat, (Throwable)ex);
            }
            catch (final DynamiteModule$LoadingException ex2) {
                if (!this.b.b()) {
                    if (!this.d) {
                        poj.a(this.a);
                        this.d = true;
                    }
                    throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.b.a(), ((Throwable)ex2).getMessage()), (Throwable)ex2);
            }
        }
    }
    
    public final void d() {
        final gqz e = this.e;
        if (e != null) {
            try {
                e.U0(2, e.s());
            }
            catch (final RemoteException ex) {
                final String value = String.valueOf(this.b.a());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to release text recognizer ".concat(value);
                }
                else {
                    concat = new String("Failed to release text recognizer ");
                }
                Log.e("DecoupledTextDelegate", concat, (Throwable)ex);
            }
            this.e = null;
        }
        this.c = false;
    }
}
