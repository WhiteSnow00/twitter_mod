import android.opengl.GLES20;
import android.util.Log;
import androidx.fragment.app.p;
import java.util.List;
import java.util.Iterator;
import androidx.fragment.app.r;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import androidx.fragment.app.Fragment;
import android.widget.TextView;
import android.view.ViewGroup;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import android.view.Surface;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gy8
{
    public Object a = ((View)this.b).findViewById(2131431978);
    public Object b = b;
    public Object c = ((View)b).findViewById(2131431981);
    public Object d = ((View)this.b).findViewById(2131431971);
    
    public gy8(final int n) {
        if (n != 1) {
            this.b = new wqk(10);
            this.c = new l7q();
            this.a = new ArrayList();
            this.d = new HashSet();
            return;
        }
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }
    
    public gy8(final Surface d) {
        this.d = d;
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.b = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            this.b = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        final EGLConfig[] array2 = { null };
        if (!EGL14.eglChooseConfig((EGLDisplay)this.b, new int[] { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 }, 0, array2, 0, 1, new int[] { 0 }, 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.c = EGL14.eglCreateContext((EGLDisplay)this.b, array2[0], EGL14.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        this.c("eglCreateContext");
        if (this.c == null) {
            throw new RuntimeException("null context");
        }
        this.a = EGL14.eglCreateWindowSurface((EGLDisplay)this.b, array2[0], (Object)this.d, new int[] { 12344 }, 0);
        this.c("eglCreateWindowSurface");
        if (this.a != null) {
            return;
        }
        throw new RuntimeException("surface was null");
    }
    
    public final void a(final Fragment fragment) {
        if (!((ArrayList)this.a).contains(fragment)) {
            synchronized ((ArrayList)this.a) {
                ((ArrayList)this.a).add(fragment);
                monitorexit((ArrayList)this.a);
                fragment.N0 = true;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void b() {
        ((HashMap)this.b).values().removeAll(Collections.singleton((Object)null));
    }
    
    public final void c(final String s) {
        boolean b = false;
        while (true) {
            final int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            final StringBuilder j = p88.j(s, ": EGL error: 0x");
            j.append(Integer.toHexString(eglGetError));
            cag.c("InputSurface", j.toString());
            b = true;
        }
        if (!b) {
            return;
        }
        throw new RuntimeException("EGL error encountered (see log)");
    }
    
    public final b5j d() {
        return asy.q((View)this.b);
    }
    
    public final void e(final Object o, final ArrayList list, final HashSet set) {
        if (list.contains(o)) {
            return;
        }
        if (!set.contains(o)) {
            set.add(o);
            final ArrayList list2 = (ArrayList)((l7q)this.c).getOrDefault(o, (Object)null);
            if (list2 != null) {
                for (int i = 0; i < list2.size(); ++i) {
                    this.e(list2.get(i), list, set);
                }
            }
            set.remove(o);
            list.add(o);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
    
    public final Fragment f(final String s) {
        final r r = ((HashMap)this.b).get(s);
        if (r != null) {
            return r.c;
        }
        return null;
    }
    
    public final Fragment g(final String s) {
        for (final r r : ((HashMap)this.b).values()) {
            if (r != null) {
                Fragment fragment = r.c;
                if (!s.equals(fragment.H0)) {
                    fragment = ((p)fragment.W0).c.g(s);
                }
                if (fragment != null) {
                    return fragment;
                }
                continue;
            }
        }
        return null;
    }
    
    public final List h() {
        final ArrayList list = new ArrayList();
        for (final r r : ((HashMap)this.b).values()) {
            if (r != null) {
                list.add(r);
            }
        }
        return list;
    }
    
    public final List i() {
        final ArrayList list = new ArrayList();
        for (final r r : ((HashMap)this.b).values()) {
            if (r != null) {
                list.add(r.c);
            }
            else {
                list.add(null);
            }
        }
        return list;
    }
    
    public final r j(final String s) {
        return ((HashMap)this.b).get(s);
    }
    
    public final List k() {
        if (((ArrayList)this.a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized ((ArrayList)this.a) {
            return new ArrayList((Collection)this.a);
        }
    }
    
    public final void l(final r r) {
        final Fragment c = r.c;
        if (((HashMap)this.b).get(c.H0) != null) {
            return;
        }
        ((HashMap)this.b).put(c.H0, r);
        if (c.e1) {
            if (c.d1) {
                ((bpb)this.d).b(c);
            }
            else {
                ((bpb)this.d).e(c);
            }
            c.e1 = false;
        }
        if (p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(c);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void m() {
        final EGLDisplay eglDisplay = (EGLDisplay)this.b;
        final Object a = this.a;
        if (EGL14.eglMakeCurrent(eglDisplay, (EGLSurface)a, (EGLSurface)a, (EGLContext)this.c)) {
            final int[] array = new int[2];
            EGL14.eglQuerySurface((EGLDisplay)this.b, (EGLSurface)this.a, 12375, array, 0);
            EGL14.eglQuerySurface((EGLDisplay)this.b, (EGLSurface)this.a, 12374, array, 1);
            GLES20.glViewport(0, 0, array[0], array[1]);
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed");
    }
    
    public final void n(final r r) {
        final Fragment c = r.c;
        if (c.d1) {
            ((bpb)this.d).e(c);
        }
        if (((HashMap)this.b).put(c.H0, null) == null) {
            return;
        }
        if (p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(c);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void o() {
        if (EGL14.eglGetCurrentContext().equals((Object)this.c)) {
            final EGLDisplay eglDisplay = (EGLDisplay)this.b;
            final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eglDisplay, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface((EGLDisplay)this.b, (EGLSurface)this.a);
        EGL14.eglDestroyContext((EGLDisplay)this.b, (EGLContext)this.c);
        ((Surface)this.d).release();
        this.b = null;
        this.c = null;
        this.a = null;
        this.d = null;
    }
    
    public final void p() {
        final EGLDisplay eglDisplay = (EGLDisplay)this.b;
        final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eglDisplay, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed");
    }
    
    public final lpb q(final String s, final lpb lpb) {
        if (lpb != null) {
            return ((HashMap)this.c).put(s, lpb);
        }
        return ((HashMap)this.c).remove(s);
    }
    
    public final void r(final int text) {
        ((TextView)this.c).setText(text);
    }
    
    public final void s(final String text) {
        ((TextView)this.a).setText((CharSequence)text);
    }
}
