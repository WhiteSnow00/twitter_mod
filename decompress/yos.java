import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import android.webkit.URLUtil;
import java.util.Iterator;
import java.io.Closeable;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.communities.subsystem.repositories.CommunityUnavailableException;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public class yos implements dax, pyy
{
    public static int C0;
    public static volatile qci D0;
    public static volatile hci E0;
    public static final int[] F0;
    public static final int[] G0;
    public static final int[] H0;
    public static final int[] I0;
    public static final int[] J0;
    public static final int[] K0;
    public static final int[] L0;
    public static final int[] M0;
    public static final c000 O0;
    
    public static final n9q e(final ss5 ss5) {
        n9q n9q;
        if (ss5 instanceof ss5$a) {
            n9q = n9q.v((Object)((ss5$a)ss5).b);
        }
        else {
            if (!(ss5 instanceof ss5$c)) {
                throw new NoWhenBranchMatchedException();
            }
            n9q = n9q.n((Throwable)new CommunityUnavailableException(ss5));
        }
        return n9q;
    }
    
    public static fft f(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final int n) {
        return new fft((ToggleTwitterButton)layoutInflater.inflate(n, viewGroup, false));
    }
    
    public static void g() {
        final int c0 = yos.C0;
        if (c0 > 0) {
            yos.C0 = c0 - 1;
        }
    }
    
    public static final long h(final mg3 mg3) {
        zzd.f((Object)mg3, "<this>");
        Objects.requireNonNull(zv9.Companion);
        return ((zv9)afw.Companion.a().c((Class)zv9.class)).O1().d(mg3);
    }
    
    public static final or7 i(hih e, final long n) {
        zzd.f((Object)e, "<this>");
        e = (hih)e.e((Class)fs6.class, "entry_id", (Iterable)tdy.u((Object[])new Long[] { n }), (Class)ls6.class);
        try {
            final ArrayList list = new ArrayList();
            for (final Object next : e) {
                if (next instanceof or7) {
                    list.add(next);
                }
            }
            return (or7)or4.I1((List)list);
        }
        finally {
            e2e.Companion.b((Closeable)e);
        }
    }
    
    public static final long j(final c6 c6) {
        zzd.f((Object)c6, "<this>");
        return (long)Math.ceil((c6.b - c6.a) / (double)1000L);
    }
    
    public static String k(String s) throws MalformedURLException {
        String trim = s;
        if (!s.equals("")) {
            s = (trim = s.trim());
            if (!URLUtil.isValidUrl(s)) {
                trim = s;
                if (!s.startsWith("res://")) {
                    trim = s;
                    if (!s.startsWith("capi://")) {
                        if (!s.startsWith("card://")) {
                            throw new MalformedURLException(s);
                        }
                        trim = s;
                    }
                }
            }
        }
        return trim;
    }
    
    public static void l(final InputStream inputStream, final File file) throws IOException {
        final byte[] array = new byte[8192];
        final Closeable closeable = null;
        Closeable closeable2;
        try {
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            try {
                while (true) {
                    final int read = inputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    gzipOutputStream.write(array, 0, read);
                }
                gzipOutputStream.finish();
                wx4.b((Closeable)gzipOutputStream);
                return;
            }
            finally {}
        }
        finally {
            closeable2 = closeable;
        }
        wx4.b(closeable2);
    }
    
    public static View m(final ViewGroup viewGroup, final int n) {
        zzd.f((Object)viewGroup, "<this>");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(n, viewGroup, false);
        zzd.e((Object)inflate, "from(context).inflate(la\u2026utId, this, attachToRoot)");
        return inflate;
    }
    
    public static boolean n() {
        return dta.b().b("mixed_media_consumption_enabled", false);
    }
    
    public static boolean o() {
        return dta.b().b("mixed_media_creation_enabled", false);
    }
    
    public static boolean p() {
        return n() || o();
    }
    
    public static boolean q() {
        return dta.b().b("home_timeline_spheres_pinned_lists_backend_storage_migration_enabled", false);
    }
    
    public static String r(final int n, final long n2) {
        if (1 == n) {
            return String.valueOf(0L);
        }
        if (n2 > -1L) {
            return String.valueOf(n2);
        }
        return String.valueOf(-1L);
    }
    
    public static final void s(final View view, int dimensionPixelSize) {
        zzd.f((Object)view, "<this>");
        final Resources resources = view.getContext().getResources();
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
        dimensionPixelSize = resources.getDimensionPixelSize(dimensionPixelSize);
        viewGroup$MarginLayoutParams.setMargins(viewGroup$MarginLayoutParams.leftMargin, dimensionPixelSize, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
        view.setLayoutParams(layoutParams);
    }
    
    public Object a() {
        final azy c = fzy.c;
        return dvz.D0.b().e();
    }
    
    public void b(final View view) {
    }
    
    public void d(final View view) {
    }
}
