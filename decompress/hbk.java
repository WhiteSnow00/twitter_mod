import android.os.BaseBundle;
import android.content.Context;
import android.app.Person$Builder;
import android.net.Uri;
import android.graphics.drawable.Icon;
import android.content.res.Resources;
import android.app.Person;
import android.os.PersistableBundle;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.graphics.Bitmap;
import java.util.Objects;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbk
{
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    
    public hbk(final c c) {
        this.a = c.a;
        this.b = c.b;
        this.c = c.c;
        this.d = c.d;
        this.e = c.e;
        this.f = c.f;
    }
    
    public final Bundle a() {
        final Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        final IconCompat b = this.b;
        Bundle bundle3;
        if (b != null) {
            Objects.requireNonNull(b);
            final Bundle bundle2 = new Bundle();
            switch (b.a) {
                default: {
                    throw new IllegalArgumentException("Invalid icon");
                }
                case 3: {
                    bundle2.putByteArray("obj", (byte[])b.b);
                    break;
                }
                case 2:
                case 4:
                case 6: {
                    ((BaseBundle)bundle2).putString("obj", (String)b.b);
                    break;
                }
                case 1:
                case 5: {
                    bundle2.putParcelable("obj", (Parcelable)b.b);
                    break;
                }
                case -1: {
                    bundle2.putParcelable("obj", (Parcelable)b.b);
                    break;
                }
            }
            ((BaseBundle)bundle2).putInt("type", b.a);
            ((BaseBundle)bundle2).putInt("int1", b.e);
            ((BaseBundle)bundle2).putInt("int2", b.f);
            ((BaseBundle)bundle2).putString("string1", b.j);
            final ColorStateList g = b.g;
            if (g != null) {
                bundle2.putParcelable("tint_list", (Parcelable)g);
            }
            final PorterDuff$Mode h = b.h;
            bundle3 = bundle2;
            if (h != IconCompat.k) {
                ((BaseBundle)bundle2).putString("tint_mode", ((Enum)h).name());
                bundle3 = bundle2;
            }
        }
        else {
            bundle3 = null;
        }
        bundle.putBundle("icon", bundle3);
        ((BaseBundle)bundle).putString("uri", this.c);
        ((BaseBundle)bundle).putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }
    
    public static final class a
    {
        public static hbk a(final PersistableBundle persistableBundle) {
            final c c = new c();
            c.a = ((BaseBundle)persistableBundle).getString("name");
            c.c = ((BaseBundle)persistableBundle).getString("uri");
            c.d = ((BaseBundle)persistableBundle).getString("key");
            c.e = persistableBundle.getBoolean("isBot");
            c.f = persistableBundle.getBoolean("isImportant");
            return new hbk(c);
        }
        
        public static PersistableBundle b(final hbk hbk) {
            final PersistableBundle persistableBundle = new PersistableBundle();
            final CharSequence a = hbk.a;
            String string;
            if (a != null) {
                string = a.toString();
            }
            else {
                string = null;
            }
            ((BaseBundle)persistableBundle).putString("name", string);
            ((BaseBundle)persistableBundle).putString("uri", hbk.c);
            ((BaseBundle)persistableBundle).putString("key", hbk.d);
            persistableBundle.putBoolean("isBot", hbk.e);
            persistableBundle.putBoolean("isImportant", hbk.f);
            return persistableBundle;
        }
    }
    
    public static final class b
    {
        public static hbk a(final Person person) {
            final c c = new c();
            c.a = person.getName();
            final Icon icon = person.getIcon();
            IconCompat e = null;
            if (icon != null) {
                final Icon icon2 = person.getIcon();
                final PorterDuff$Mode k = IconCompat.k;
                Objects.requireNonNull(icon2);
                final int c2 = IconCompat.a.c(icon2);
                if (c2 != 2) {
                    if (c2 != 4) {
                        if (c2 != 6) {
                            e = new IconCompat(-1);
                            e.b = icon2;
                        }
                        else {
                            final Uri d = IconCompat.a.d(icon2);
                            Objects.requireNonNull(d);
                            final String string = d.toString();
                            Objects.requireNonNull(string);
                            e = new IconCompat(6);
                            e.b = string;
                        }
                    }
                    else {
                        final Uri d2 = IconCompat.a.d(icon2);
                        Objects.requireNonNull(d2);
                        final String string2 = d2.toString();
                        Objects.requireNonNull(string2);
                        e = new IconCompat(4);
                        e.b = string2;
                    }
                }
                else {
                    e = IconCompat.e(null, IconCompat.a.b(icon2), IconCompat.a.a(icon2));
                }
            }
            c.b = e;
            c.c = person.getUri();
            c.d = person.getKey();
            c.e = person.isBot();
            c.f = person.isImportant();
            return new hbk(c);
        }
        
        public static Person b(final hbk hbk) {
            final Person$Builder setName = new Person$Builder().setName(hbk.a);
            final IconCompat b = hbk.b;
            Icon m = null;
            if (b != null) {
                m = b.m(null);
            }
            return setName.setIcon(m).setUri(hbk.c).setKey(hbk.d).setBot(hbk.e).setImportant(hbk.f).build();
        }
    }
    
    public static final class c
    {
        public CharSequence a;
        public IconCompat b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
    }
}
