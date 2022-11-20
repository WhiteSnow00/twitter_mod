// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.graphics.drawable;

import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.Icon;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources;
import android.content.Context;
import java.util.Objects;
import android.graphics.Shader;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable
{
    public static final PorterDuff$Mode k;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public String i;
    public String j;
    
    static {
        k = PorterDuff$Mode.SRC_IN;
    }
    
    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.k;
        this.i = null;
    }
    
    public IconCompat(final int a) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.k;
        this.i = null;
        this.a = a;
    }
    
    public static Bitmap b(final Bitmap bitmap, final boolean b) {
        final int n = (int)(Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        final Bitmap bitmap2 = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint(3);
        final float n2 = (float)n;
        final float n3 = 0.5f * n2;
        final float n4 = 0.9166667f * n3;
        if (b) {
            final float n5 = 0.010416667f * n2;
            paint.setColor(0);
            paint.setShadowLayer(n5, 0.0f, n2 * 0.020833334f, 1023410176);
            canvas.drawCircle(n3, n3, n4, paint);
            paint.setShadowLayer(n5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(n3, n3, n4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        final Shader$TileMode clamp = Shader$TileMode.CLAMP;
        final BitmapShader shader = new BitmapShader(bitmap, clamp, clamp);
        final Matrix localMatrix = new Matrix();
        localMatrix.setTranslate(-(bitmap.getWidth() - n) / 2.0f, -(bitmap.getHeight() - n) / 2.0f);
        ((Shader)shader).setLocalMatrix(localMatrix);
        paint.setShader((Shader)shader);
        canvas.drawCircle(n3, n3, n4, paint);
        canvas.setBitmap((Bitmap)null);
        return bitmap2;
    }
    
    public static IconCompat c(final Bitmap b) {
        Objects.requireNonNull(b);
        final IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = b;
        return iconCompat;
    }
    
    public static IconCompat d(final Context context, final int n) {
        Objects.requireNonNull(context);
        return e(context.getResources(), context.getPackageName(), n);
    }
    
    public static IconCompat e(final Resources resources, final String s, final int e) {
        Objects.requireNonNull(s);
        if (e != 0) {
            final IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = e;
            Label_0055: {
                if (resources != null) {
                    try {
                        iconCompat.b = resources.getResourceName(e);
                        break Label_0055;
                    }
                    catch (final Resources$NotFoundException ex) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                }
                iconCompat.b = s;
            }
            iconCompat.j = s;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
    
    public static Resources i(final Context context, final String s) {
        if ("android".equals(s)) {
            return Resources.getSystem();
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", s), (Throwable)ex);
            return null;
        }
    }
    
    public final void a(final Context context) {
        if (this.a == 2) {
            final Object b = this.b;
            if (b != null) {
                final String s = (String)b;
                if (!s.contains(":")) {
                    return;
                }
                final String s2 = s.split(":", -1)[1];
                final String s3 = s2.split("/", -1)[0];
                final String s4 = s2.split("/", -1)[1];
                final String s5 = s.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(s4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                final String h = this.h();
                final int identifier = i(context, h).getIdentifier(s4, s3, s5);
                if (this.e != identifier) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Id has changed for ");
                    sb.append(h);
                    sb.append(" ");
                    sb.append(s);
                    Log.i("IconCompat", sb.toString());
                    this.e = identifier;
                }
            }
        }
    }
    
    public final Bitmap f() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            final Object b = this.b;
            if (b instanceof Bitmap) {
                return (Bitmap)b;
            }
            return null;
        }
        else {
            if (a == 1) {
                return (Bitmap)this.b;
            }
            if (a == 5) {
                return b((Bitmap)this.b, true);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public final int g() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            return IconCompat.a.a(this.b);
        }
        if (a == 2) {
            return this.e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    public final String h() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            return IconCompat.a.b(this.b);
        }
        if (a != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("called getResPackage() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        final String j = this.j;
        if (j != null && !TextUtils.isEmpty((CharSequence)j)) {
            return this.j;
        }
        return ((String)this.b).split(":", -1)[0];
    }
    
    public final int j() {
        int n2;
        final int n = n2 = this.a;
        if (n == -1) {
            n2 = n;
            if (Build$VERSION.SDK_INT >= 23) {
                n2 = IconCompat.a.c(this.b);
            }
        }
        return n2;
    }
    
    public final Uri k() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            return IconCompat.a.d(this.b);
        }
        if (a != 4 && a != 6) {
            final StringBuilder sb = new StringBuilder();
            sb.append("called getUri() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        return Uri.parse((String)this.b);
    }
    
    public final InputStream l(final Context context) {
        final Uri k = this.k();
        final String scheme = k.getScheme();
        if (!"content".equals(scheme)) {
            if (!"file".equals(scheme)) {
                try {
                    return new FileInputStream(new File((String)this.b));
                }
                catch (final FileNotFoundException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to load image from path: ");
                    sb.append(k);
                    Log.w("IconCompat", sb.toString(), (Throwable)ex);
                    return null;
                }
            }
        }
        try {
            return context.getContentResolver().openInputStream(k);
        }
        catch (final Exception ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to load image from URI: ");
            sb2.append(k);
            Log.w("IconCompat", sb2.toString(), (Throwable)ex2);
        }
        return null;
    }
    
    public final Icon m(final Context context) {
        if (Build$VERSION.SDK_INT >= 23) {
            return IconCompat.a.f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }
    
    public final String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        final StringBuilder sb = new StringBuilder("Icon(typ=");
        String s = null;
        switch (this.a) {
            default: {
                s = "UNKNOWN";
                break;
            }
            case 6: {
                s = "URI_MASKABLE";
                break;
            }
            case 5: {
                s = "BITMAP_MASKABLE";
                break;
            }
            case 4: {
                s = "URI";
                break;
            }
            case 3: {
                s = "DATA";
                break;
            }
            case 2: {
                s = "RESOURCE";
                break;
            }
            case 1: {
                s = "BITMAP";
                break;
            }
        }
        sb.append(s);
        switch (this.a) {
            case 4:
            case 6: {
                sb.append(" uri=");
                sb.append(this.b);
                break;
            }
            case 3: {
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            }
            case 2: {
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", this.g()));
                break;
            }
            case 1:
            case 5: {
                sb.append(" size=");
                sb.append(((Bitmap)this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap)this.b).getHeight());
                break;
            }
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != IconCompat.k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public static int a(final Object o) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.a(o);
            }
            try {
                return (int)o.getClass().getMethod("getResId", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
            }
            catch (final NoSuchMethodException ex) {
                Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex);
                return 0;
            }
            catch (final InvocationTargetException ex2) {
                Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex2);
                return 0;
            }
            catch (final IllegalAccessException ex3) {
                Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex3);
                return 0;
            }
        }
        
        public static String b(final Object o) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.b(o);
            }
            try {
                return (String)o.getClass().getMethod("getResPackage", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
            }
            catch (final NoSuchMethodException ex) {
                Log.e("IconCompat", "Unable to get icon package", (Throwable)ex);
                return null;
            }
            catch (final InvocationTargetException ex2) {
                Log.e("IconCompat", "Unable to get icon package", (Throwable)ex2);
                return null;
            }
            catch (final IllegalAccessException ex3) {
                Log.e("IconCompat", "Unable to get icon package", (Throwable)ex3);
                return null;
            }
        }
        
        public static int c(final Object o) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.c(o);
            }
            try {
                return (int)o.getClass().getMethod("getType", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
            }
            catch (final NoSuchMethodException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(o);
                Log.e("IconCompat", sb.toString(), (Throwable)ex);
                return -1;
            }
            catch (final InvocationTargetException ex2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(o);
                Log.e("IconCompat", sb2.toString(), (Throwable)ex2);
                return -1;
            }
            catch (final IllegalAccessException ex3) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to get icon type ");
                sb3.append(o);
                Log.e("IconCompat", sb3.toString(), (Throwable)ex3);
                return -1;
            }
        }
        
        public static Uri d(final Object o) {
            if (Build$VERSION.SDK_INT >= 28) {
                return c.d(o);
            }
            try {
                return (Uri)o.getClass().getMethod("getUri", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
            }
            catch (final NoSuchMethodException ex) {
                Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex);
                return null;
            }
            catch (final InvocationTargetException ex2) {
                Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex2);
                return null;
            }
            catch (final IllegalAccessException ex3) {
                Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex3);
                return null;
            }
        }
        
        public static Drawable e(final Icon icon, final Context context) {
            return icon.loadDrawable(context);
        }
        
        public static Icon f(final IconCompat iconCompat, final Context context) {
            Icon icon = null;
            switch (iconCompat.a) {
                default: {
                    throw new IllegalArgumentException("Unknown type");
                }
                case 6: {
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT >= 30) {
                        icon = d.a(iconCompat.k());
                        break;
                    }
                    if (context == null) {
                        final StringBuilder j = fu8.j("Context is required to resolve the file uri of the icon: ");
                        j.append(iconCompat.k());
                        throw new IllegalArgumentException(j.toString());
                    }
                    final InputStream l = iconCompat.l(context);
                    if (l == null) {
                        final StringBuilder i = fu8.j("Cannot load adaptive icon from uri: ");
                        i.append(iconCompat.k());
                        throw new IllegalStateException(i.toString());
                    }
                    if (sdk_INT >= 26) {
                        icon = b.b(BitmapFactory.decodeStream(l));
                        break;
                    }
                    icon = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(l), false));
                    break;
                }
                case 5: {
                    if (Build$VERSION.SDK_INT >= 26) {
                        icon = b.b((Bitmap)iconCompat.b);
                        break;
                    }
                    icon = Icon.createWithBitmap(IconCompat.b((Bitmap)iconCompat.b, false));
                    break;
                }
                case 4: {
                    icon = Icon.createWithContentUri((String)iconCompat.b);
                    break;
                }
                case 3: {
                    icon = Icon.createWithData((byte[])iconCompat.b, iconCompat.e, iconCompat.f);
                    break;
                }
                case 2: {
                    icon = Icon.createWithResource(iconCompat.h(), iconCompat.e);
                    break;
                }
                case 1: {
                    icon = Icon.createWithBitmap((Bitmap)iconCompat.b);
                    break;
                }
                case -1: {
                    return (Icon)iconCompat.b;
                }
            }
            final ColorStateList g = iconCompat.g;
            if (g != null) {
                icon.setTintList(g);
            }
            final PorterDuff$Mode h = iconCompat.h;
            if (h != IconCompat.k) {
                icon.setTintMode(h);
            }
            return icon;
        }
    }
    
    public static final class b
    {
        public static Drawable a(final Drawable drawable, final Drawable drawable2) {
            return (Drawable)new AdaptiveIconDrawable(drawable, drawable2);
        }
        
        public static Icon b(final Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }
    
    public static final class c
    {
        public static int a(final Object o) {
            return ((Icon)o).getResId();
        }
        
        public static String b(final Object o) {
            return ((Icon)o).getResPackage();
        }
        
        public static int c(final Object o) {
            return ((Icon)o).getType();
        }
        
        public static Uri d(final Object o) {
            return ((Icon)o).getUri();
        }
    }
    
    public static final class d
    {
        public static Icon a(final Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }
}
