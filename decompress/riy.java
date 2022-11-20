import android.util.Log;
import android.os.IBinder;
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

public final class riy implements chz
{
    public final Context a;
    public final kjs b;
    public boolean c;
    public boolean d;
    public hpz e;
    
    public riy(final Context a, final kjs b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final kes a(final wqd wqd) throws MlKitException {
        if (this.e == null) {
            this.c();
        }
        final hpz e = this.e;
        Objects.requireNonNull(e, "null reference");
        if (!this.c) {
            try {
                ((u8y)e).U0(1, ((u8y)e).s());
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
        final cpz cpz = new cpz(wqd.e, wqd.b, wqd.c, rw4.a(wqd.d), SystemClock.elapsedRealtime());
        Objects.requireNonNull(o8d.b);
        final int e2 = wqd.e;
        final sqz sqz = null;
        Label_0232: {
            if (e2 != -1) {
                if (e2 != 17) {
                    if (e2 == 35) {
                        final d5j d5j = new d5j((Object)null);
                        break Label_0232;
                    }
                    if (e2 != 842094169) {
                        throw new MlKitException(jxa.p(37, "Unsupported image format: ", wqd.e), 3);
                    }
                }
                Objects.requireNonNull((Object)null, "null reference");
                throw null;
            }
            final Bitmap a = wqd.a;
            Objects.requireNonNull(a, "null reference");
            final d5j d5j = new d5j((Object)a);
            try {
                final Parcel s = ((u8y)e).s();
                kny.a(s, (IInterface)d5j);
                s.writeInt(1);
                cpz.writeToParcel(s, 0);
                final Parcel x = ((u8y)e).x(3, s);
                final Parcelable$Creator creator = sqz.CREATOR;
                Object o;
                if (x.readInt() == 0) {
                    o = sqz;
                }
                else {
                    o = creator.createFromParcel(x);
                }
                final sqz sqz2 = (sqz)o;
                x.recycle();
                return new kes(sqz2);
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
    
    @Override
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
                final IBinder b = DynamiteModule.c(a, (DynamiteModule.a)o, this.b.d()).b(this.b.f());
                final int a2 = npz.a;
                Object o2;
                if (b == null) {
                    o2 = null;
                }
                else {
                    final IInterface queryLocalInterface = b.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    if (queryLocalInterface instanceof ppz) {
                        o2 = queryLocalInterface;
                    }
                    else {
                        o2 = new kpz(b);
                    }
                }
                this.e = ((ppz)o2).a1((l2d)new d5j((Object)this.a));
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
            catch (final DynamiteModule.LoadingException ex2) {
                if (!this.b.b()) {
                    if (!this.d) {
                        aoj.a(this.a);
                        this.d = true;
                    }
                    throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.b.a(), ex2.getMessage()), (Throwable)ex2);
            }
        }
    }
    
    @Override
    public final void d() {
        final hpz e = this.e;
        if (e != null) {
            try {
                ((u8y)e).U0(2, ((u8y)e).s());
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
