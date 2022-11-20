import android.view.View$OnClickListener;
import android.view.View;
import java.util.Map;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.Objects;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.Iterator;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.view.MotionEvent;
import android.util.SparseIntArray;
import java.util.HashMap;
import androidx.constraintlayout.widget.b;
import android.util.SparseArray;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irh
{
    public final erh a;
    public l9r b;
    public b c;
    public ArrayList<b> d;
    public b e;
    public ArrayList<b> f;
    public SparseArray<androidx.constraintlayout.widget.b> g;
    public HashMap<String, Integer> h;
    public SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public erh.g o;
    public boolean p;
    public final ccx q;
    public float r;
    public float s;
    
    public irh(final Context context, final erh a, final int n) {
        this.b = null;
        this.c = null;
        this.d = new ArrayList<b>();
        this.e = null;
        this.f = new ArrayList<b>();
        this.g = (SparseArray<androidx.constraintlayout.widget.b>)new SparseArray();
        this.h = new HashMap<String, Integer>();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = a;
        this.q = new ccx(a);
        final XmlResourceParser xml = context.getResources().getXml(n);
        try {
            int i = ((XmlPullParser)xml).getEventType();
            b b = null;
            while (i != 1) {
                b b2;
                if (i != 0) {
                    final int n2 = 2;
                    if (i != 2) {
                        b2 = b;
                    }
                    else {
                        final String name = ((XmlPullParser)xml).getName();
                        int n3 = 0;
                        Label_0439: {
                            switch (name.hashCode()) {
                                case 1942574248: {
                                    if (name.equals("include")) {
                                        n3 = 6;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case 1382829617: {
                                    if (name.equals("StateSet")) {
                                        n3 = 4;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case 793277014: {
                                    if (name.equals("MotionScene")) {
                                        n3 = 0;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case 327855227: {
                                    if (name.equals("OnSwipe")) {
                                        n3 = n2;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case 312750793: {
                                    if (name.equals("OnClick")) {
                                        n3 = 3;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case 269306229: {
                                    if (name.equals("Transition")) {
                                        n3 = 1;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case 61998586: {
                                    if (name.equals("ViewTransition")) {
                                        n3 = 9;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case -687739768: {
                                    if (name.equals("Include")) {
                                        n3 = 7;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case -1239391468: {
                                    if (name.equals("KeyFrameSet")) {
                                        n3 = 8;
                                        break Label_0439;
                                    }
                                    break;
                                }
                                case -1349929691: {
                                    if (name.equals("ConstraintSet")) {
                                        n3 = 5;
                                        break Label_0439;
                                    }
                                    break;
                                }
                            }
                            n3 = -1;
                        }
                        switch (n3) {
                            default: {
                                b2 = b;
                                break;
                            }
                            case 9: {
                                final bcx bcx = new bcx(context, (XmlPullParser)xml);
                                final ccx q = this.q;
                                q.b.add(bcx);
                                q.c = null;
                                final int b3 = bcx.b;
                                if (b3 == 4) {
                                    q.b(bcx, true);
                                    b2 = b;
                                    break;
                                }
                                b2 = b;
                                if (b3 == 5) {
                                    q.b(bcx, false);
                                    b2 = b;
                                    break;
                                }
                                break;
                            }
                            case 8: {
                                final ope ope = new ope(context, (XmlPullParser)xml);
                                b2 = b;
                                if (b != null) {
                                    b.k.add(ope);
                                    b2 = b;
                                    break;
                                }
                                break;
                            }
                            case 6:
                            case 7: {
                                this.l(context, (XmlPullParser)xml);
                                b2 = b;
                                break;
                            }
                            case 5: {
                                this.j(context, (XmlPullParser)xml);
                                b2 = b;
                                break;
                            }
                            case 4: {
                                this.b = new l9r(context, (XmlPullParser)xml);
                                b2 = b;
                                break;
                            }
                            case 3: {
                                b2 = b;
                                if (b != null) {
                                    b.m.add(new b.a(context, b, (XmlPullParser)xml));
                                    b2 = b;
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                if (b == null) {
                                    final String resourceEntryName = context.getResources().getResourceEntryName(n);
                                    final int lineNumber = ((XmlPullParser)xml).getLineNumber();
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(" OnSwipe (");
                                    sb.append(resourceEntryName);
                                    sb.append(".xml:");
                                    sb.append(lineNumber);
                                    sb.append(")");
                                    Log.v("MotionScene", sb.toString());
                                }
                                if ((b2 = b) != null) {
                                    b.l = new kut(context, this.a, (XmlPullParser)xml);
                                    b2 = b;
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                final ArrayList<b> d = this.d;
                                final b b4 = new b(this, context, (XmlPullParser)xml);
                                d.add(b4);
                                if (this.c == null && !b4.b) {
                                    this.c = b4;
                                    final kut l = b4.l;
                                    if (l != null) {
                                        l.c(this.p);
                                    }
                                }
                                b2 = b4;
                                if (b4.b) {
                                    if (b4.c == -1) {
                                        this.e = b4;
                                    }
                                    else {
                                        this.f.add(b4);
                                    }
                                    this.d.remove(b4);
                                    b2 = b4;
                                    break;
                                }
                                break;
                            }
                            case 0: {
                                this.m(context, (XmlPullParser)xml);
                                b2 = b;
                                break;
                            }
                        }
                    }
                }
                else {
                    ((XmlPullParser)xml).getName();
                    b2 = b;
                }
                i = ((XmlPullParser)xml).next();
                b = b2;
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
        this.g.put(2131430139, (Object)new androidx.constraintlayout.widget.b());
        this.h.put("motion_base", 2131430139);
    }
    
    public final boolean a(final erh erh, final int n) {
        final erh.j g0 = erh.j.G0;
        final erh.j f0 = erh.j.F0;
        final erh.j e0 = erh.j.E0;
        if (this.o != null) {
            return false;
        }
        for (final b b : this.d) {
            if (b.n == 0) {
                continue;
            }
            final b c = this.c;
            if (c == b && c.a(2)) {
                continue;
            }
            if (n == b.d) {
                final int n2 = b.n;
                if (n2 == 4 || n2 == 2) {
                    erh.setState(g0);
                    erh.setTransition(b);
                    if (b.n == 4) {
                        erh.P();
                        erh.setState(e0);
                        erh.setState(f0);
                    }
                    else {
                        erh.setProgress(1.0f);
                        erh.C(true);
                        erh.setState(e0);
                        erh.setState(f0);
                        erh.setState(g0);
                        erh.J();
                    }
                    return true;
                }
            }
            if (n != b.c) {
                continue;
            }
            final int n3 = b.n;
            if (n3 == 3 || n3 == 1) {
                erh.setState(g0);
                erh.setTransition(b);
                if (b.n == 3) {
                    erh.A(0.0f);
                    erh.setState(e0);
                    erh.setState(f0);
                }
                else {
                    erh.setProgress(0.0f);
                    erh.C(true);
                    erh.setState(e0);
                    erh.setState(f0);
                    erh.setState(g0);
                    erh.J();
                }
                return true;
            }
        }
        return false;
    }
    
    public final androidx.constraintlayout.widget.b b(final int n) {
        final l9r b = this.b;
        int n2 = n;
        if (b != null) {
            final int a = b.a(n);
            n2 = n;
            if (a != -1) {
                n2 = a;
            }
        }
        androidx.constraintlayout.widget.b b2;
        if (this.g.get(n2) == null) {
            final StringBuilder j = fu8.j("Warning could not find ConstraintSet id/");
            j.append(la8.c(((View)this.a).getContext(), n2));
            j.append(" In MotionScene");
            Log.e("MotionScene", j.toString());
            final SparseArray<androidx.constraintlayout.widget.b> g = this.g;
            b2 = (androidx.constraintlayout.widget.b)g.get(g.keyAt(0));
        }
        else {
            b2 = (androidx.constraintlayout.widget.b)this.g.get(n2);
        }
        return b2;
    }
    
    public final int c() {
        final b c = this.c;
        if (c != null) {
            return c.h;
        }
        return this.j;
    }
    
    public final int d() {
        final b c = this.c;
        if (c == null) {
            return -1;
        }
        return c.c;
    }
    
    public final int e(final Context context, final String s) {
        int identifier;
        if (s.contains("/")) {
            identifier = context.getResources().getIdentifier(s.substring(s.indexOf(47) + 1), "id", context.getPackageName());
        }
        else {
            identifier = -1;
        }
        int int1 = identifier;
        if (identifier == -1) {
            if (s.length() > 1) {
                int1 = Integer.parseInt(s.substring(1));
            }
            else {
                Log.e("MotionScene", "error in parsing id");
                int1 = identifier;
            }
        }
        return int1;
    }
    
    public final Interpolator f() {
        final b c = this.c;
        final int e = c.e;
        if (e == -2) {
            return AnimationUtils.loadInterpolator(((View)this.a).getContext(), this.c.g);
        }
        if (e == -1) {
            return (Interpolator)new Interpolator(ip9.c(c.f)) {
                public final ip9 a;
                
                public final float getInterpolation(final float n) {
                    return (float)this.a.a(n);
                }
            };
        }
        if (e == 0) {
            return (Interpolator)new AccelerateDecelerateInterpolator();
        }
        if (e == 1) {
            return (Interpolator)new AccelerateInterpolator();
        }
        if (e == 2) {
            return (Interpolator)new DecelerateInterpolator();
        }
        if (e == 4) {
            return (Interpolator)new BounceInterpolator();
        }
        if (e == 5) {
            return (Interpolator)new OvershootInterpolator();
        }
        if (e != 6) {
            return null;
        }
        return (Interpolator)new AnticipateInterpolator();
    }
    
    public final void g(final xqh xqh) {
        final b c = this.c;
        if (c == null) {
            final b e = this.e;
            if (e != null) {
                final Iterator<ope> iterator = e.k.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(xqh);
                }
            }
            return;
        }
        final Iterator<ope> iterator2 = c.k.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().a(xqh);
        }
    }
    
    public final float h() {
        final b c = this.c;
        if (c != null) {
            final kut l = c.l;
            if (l != null) {
                return l.t;
            }
        }
        return 0.0f;
    }
    
    public final int i() {
        final b c = this.c;
        if (c == null) {
            return -1;
        }
        return c.d;
    }
    
    public final int j(final Context context, final XmlPullParser xmlPullParser) {
        final androidx.constraintlayout.widget.b b = new androidx.constraintlayout.widget.b();
        b.e = false;
        final int attributeCount = xmlPullParser.getAttributeCount();
        int i = 0;
        int e = -1;
        int e2 = -1;
        while (i < attributeCount) {
            final String attributeName = xmlPullParser.getAttributeName(i);
            String s = xmlPullParser.getAttributeValue(i);
            Objects.requireNonNull(attributeName);
            final int hashCode = attributeName.hashCode();
            int n = 0;
            Label_0151: {
                if (hashCode != -1496482599) {
                    if (hashCode != -1153153640) {
                        if (hashCode == 3355) {
                            if (attributeName.equals("id")) {
                                n = 2;
                                break Label_0151;
                            }
                        }
                    }
                    else if (attributeName.equals("constraintRotate")) {
                        n = 1;
                        break Label_0151;
                    }
                }
                else if (attributeName.equals("deriveConstraintsFrom")) {
                    n = 0;
                    break Label_0151;
                }
                n = -1;
            }
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        e = this.e(context, s);
                        final HashMap<String, Integer> h = this.h;
                        final int index = s.indexOf(47);
                        if (index >= 0) {
                            s = s.substring(index + 1);
                        }
                        h.put(s, e);
                        b.a = la8.c(context, e);
                    }
                }
                else {
                    try {
                        b.c = Integer.parseInt(s);
                    }
                    catch (final NumberFormatException ex) {
                        Objects.requireNonNull(s);
                        int n2 = 0;
                        Label_0412: {
                            switch (s) {
                                case "x_right": {
                                    n2 = 4;
                                    break Label_0412;
                                }
                                case "right": {
                                    n2 = 3;
                                    break Label_0412;
                                }
                                case "none": {
                                    n2 = 2;
                                    break Label_0412;
                                }
                                case "left": {
                                    n2 = 1;
                                    break Label_0412;
                                }
                                case "x_left": {
                                    n2 = 0;
                                    break Label_0412;
                                }
                                default:
                                    break;
                            }
                            n2 = -1;
                        }
                        if (n2 != 0) {
                            if (n2 != 1) {
                                if (n2 != 2) {
                                    if (n2 != 3) {
                                        if (n2 == 4) {
                                            b.c = 3;
                                        }
                                    }
                                    else {
                                        b.c = 1;
                                    }
                                }
                                else {
                                    b.c = 0;
                                }
                            }
                            else {
                                b.c = 2;
                            }
                        }
                        else {
                            b.c = 4;
                        }
                    }
                }
            }
            else {
                e2 = this.e(context, s);
            }
            ++i;
        }
        if (e != -1) {
            final int p2 = this.a.p1;
            b.p(context, xmlPullParser);
            if (e2 != -1) {
                this.i.put(e, e2);
            }
            this.g.put(e, (Object)b);
        }
        return e;
    }
    
    public final int k(final Context context, int i) {
        final XmlResourceParser xml = context.getResources().getXml(i);
        try {
            String name;
            for (i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                name = ((XmlPullParser)xml).getName();
                if (2 == i && "ConstraintSet".equals(name)) {
                    return this.j(context, (XmlPullParser)xml);
                }
            }
            return -1;
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        catch (final XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
        return -1;
    }
    
    public final void l(final Context context, final XmlPullParser xmlPullParser) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), as2.n1);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.k(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void m(final Context context, final XmlPullParser xmlPullParser) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), as2.d1);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                if ((this.j = obtainStyledAttributes.getInt(index, this.j)) < 8) {
                    this.j = 8;
                }
            }
            else if (index == 1) {
                this.k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void n(int i, final erh erh) {
        final androidx.constraintlayout.widget.b b = (androidx.constraintlayout.widget.b)this.g.get(i);
        b.b = b.a;
        i = this.i.get(i);
        if (i > 0) {
            this.n(i, erh);
            final androidx.constraintlayout.widget.b b2 = (androidx.constraintlayout.widget.b)this.g.get(i);
            if (b2 == null) {
                final StringBuilder j = fu8.j("ERROR! invalid deriveConstraintsFrom: @id/");
                j.append(la8.c(((View)this.a).getContext(), i));
                Log.e("MotionScene", j.toString());
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(b.b);
            sb.append("/");
            sb.append(b2.b);
            b.b = sb.toString();
            for (final Integer n : b2.f.keySet()) {
                i = n;
                final androidx.constraintlayout.widget.b.a a = b2.f.get(n);
                if (!b.f.containsKey(i)) {
                    b.f.put(i, new androidx.constraintlayout.widget.b.a());
                }
                final androidx.constraintlayout.widget.b.a a2 = b.f.get(i);
                if (a2 == null) {
                    continue;
                }
                final androidx.constraintlayout.widget.b.b e = a2.e;
                if (!e.b) {
                    e.a(a.e);
                }
                final androidx.constraintlayout.widget.b.d c = a2.c;
                if (!c.a) {
                    c.a(a.c);
                }
                final androidx.constraintlayout.widget.b.e f = a2.f;
                if (!f.a) {
                    f.a(a.f);
                }
                final androidx.constraintlayout.widget.b.c d = a2.d;
                if (!d.a) {
                    d.a(a.d);
                }
                for (final String s : a.g.keySet()) {
                    if (!a2.g.containsKey(s)) {
                        a2.g.put(s, a.g.get(s));
                    }
                }
            }
        }
        else {
            b.b = ed.B(new StringBuilder(), b.b, "  layout");
            int childCount;
            View child;
            ConstraintLayout.a a3;
            int id;
            androidx.constraintlayout.widget.b.a a4;
            Barrier barrier;
            androidx.constraintlayout.widget.b.d c2;
            androidx.constraintlayout.widget.b.e f2;
            float pivotX;
            float pivotY;
            androidx.constraintlayout.widget.b.e f3;
            androidx.constraintlayout.widget.b.e f4;
            for (childCount = erh.getChildCount(), i = 0; i < childCount; ++i) {
                child = erh.getChildAt(i);
                a3 = (ConstraintLayout.a)child.getLayoutParams();
                id = child.getId();
                if (b.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!b.f.containsKey(id)) {
                    b.f.put(id, new androidx.constraintlayout.widget.b.a());
                }
                a4 = (androidx.constraintlayout.widget.b.a)b.f.get(id);
                if (a4 != null) {
                    if (!a4.e.b) {
                        a4.c(id, a3);
                        if (child instanceof a) {
                            a4.e.j0 = ((a)child).getReferencedIds();
                            if (child instanceof Barrier) {
                                barrier = (Barrier)child;
                                a4.e.o0 = barrier.getAllowsGoneWidget();
                                a4.e.g0 = barrier.getType();
                                a4.e.h0 = barrier.getMargin();
                            }
                        }
                        a4.e.b = true;
                    }
                    c2 = a4.c;
                    if (!c2.a) {
                        c2.b = child.getVisibility();
                        a4.c.d = child.getAlpha();
                        a4.c.a = true;
                    }
                    f2 = a4.f;
                    if (!f2.a) {
                        f2.a = true;
                        f2.b = child.getRotation();
                        a4.f.c = child.getRotationX();
                        a4.f.d = child.getRotationY();
                        a4.f.e = child.getScaleX();
                        a4.f.f = child.getScaleY();
                        pivotX = child.getPivotX();
                        pivotY = child.getPivotY();
                        if (pivotX != 0.0 || pivotY != 0.0) {
                            f3 = a4.f;
                            f3.g = pivotX;
                            f3.h = pivotY;
                        }
                        a4.f.j = child.getTranslationX();
                        a4.f.k = child.getTranslationY();
                        a4.f.l = child.getTranslationZ();
                        f4 = a4.f;
                        if (f4.m) {
                            f4.n = child.getElevation();
                        }
                    }
                }
            }
        }
        for (final androidx.constraintlayout.widget.b.a a5 : b.f.values()) {
            if (a5.h != null) {
                if (a5.b != null) {
                    final Iterator<Integer> iterator4 = b.f.keySet().iterator();
                    while (iterator4.hasNext()) {
                        final androidx.constraintlayout.widget.b.a n2 = b.n(iterator4.next());
                        final String l0 = n2.e.l0;
                        if (l0 != null && a5.b.matches(l0)) {
                            a5.h.e(n2);
                            n2.g.putAll((Map<? extends String, ? extends fi6>)a5.g.clone());
                        }
                    }
                }
                else {
                    a5.h.e(b.n(a5.a));
                }
            }
        }
    }
    
    public final void o(final erh erh) {
        int i = 0;
    Label_0085_Outer:
        while (i < this.g.size()) {
            final int key = this.g.keyAt(i);
            int j = this.i.get(key);
            int size = this.i.size();
            while (true) {
                while (j > 0) {
                    if (j != key) {
                        if (size >= 0) {
                            j = this.i.get(j);
                            --size;
                            continue Label_0085_Outer;
                        }
                    }
                    final boolean b = true;
                    if (b) {
                        Log.e("MotionScene", "Cannot be derived from yourself");
                        return;
                    }
                    this.n(key, erh);
                    ++i;
                    continue Label_0085_Outer;
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    public final void p(final int n, final int n2) {
        final l9r b = this.b;
        int a = 0;
        int a2 = 0;
        Label_0059: {
            int n3;
            if (b != null) {
                a = b.a(n);
                if (a == -1) {
                    a = n;
                }
                a2 = this.b.a(n2);
                n3 = a;
                if (a2 != -1) {
                    break Label_0059;
                }
            }
            else {
                n3 = n;
            }
            a2 = n2;
            a = n3;
        }
        final b c = this.c;
        if (c != null && c.c == n2 && c.d == n) {
            return;
        }
        for (final b c2 : this.d) {
            final int c3 = c2.c;
            if ((c3 == a2 && c2.d == a) || (c3 == n2 && c2.d == n)) {
                this.c = c2;
                final kut l = c2.l;
                if (l != null) {
                    l.c(this.p);
                }
                return;
            }
        }
        b e = this.e;
        for (final b b2 : this.f) {
            if (b2.c == n2) {
                e = b2;
            }
        }
        final b c4 = new b(this, e);
        c4.d = a;
        c4.c = a2;
        if (a != -1) {
            this.d.add(c4);
        }
        this.c = c4;
    }
    
    public final boolean q() {
        final Iterator<b> iterator = this.d.iterator();
        do {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (hasNext) {
                continue;
            }
            final b c = this.c;
            if (c == null || c.l == null) {
                b = false;
            }
            return b;
        } while (iterator.next().l == null);
        return true;
    }
    
    public static final class b
    {
        public int a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public float i;
        public final irh j;
        public ArrayList<ope> k;
        public kut l;
        public ArrayList<a> m;
        public int n;
        public boolean o;
        public int p;
        public int q;
        public int r;
        
        public b(final irh j, final int c) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<ope>();
            this.l = null;
            this.m = new ArrayList<a>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = -1;
            this.j = j;
            this.d = 2131432600;
            this.c = c;
            this.h = j.j;
            this.q = j.k;
        }
        
        public b(final irh j, final Context context, final XmlPullParser xmlPullParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<ope>();
            this.l = null;
            this.m = new ArrayList<a>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.h = j.j;
            this.q = j.k;
            this.j = j;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), as2.k1);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.c = obtainStyledAttributes.getResourceId(index, -1);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        final androidx.constraintlayout.widget.b b = new androidx.constraintlayout.widget.b();
                        b.o(context, this.c);
                        j.g.append(this.c, (Object)b);
                    }
                    else if ("xml".equals(resourceTypeName)) {
                        this.c = j.k(context, this.c);
                    }
                }
                else if (index == 3) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    final String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        final androidx.constraintlayout.widget.b b2 = new androidx.constraintlayout.widget.b();
                        b2.o(context, this.d);
                        j.g.append(this.d, (Object)b2);
                    }
                    else if ("xml".equals(resourceTypeName2)) {
                        this.d = j.k(context, this.d);
                    }
                }
                else if (index == 6) {
                    final int type = obtainStyledAttributes.peekValue(index).type;
                    if (type == 1) {
                        if ((this.g = obtainStyledAttributes.getResourceId(index, -1)) != -1) {
                            this.e = -2;
                        }
                    }
                    else if (type == 3) {
                        final String string = obtainStyledAttributes.getString(index);
                        if ((this.f = string) != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = obtainStyledAttributes.getResourceId(index, -1);
                                this.e = -2;
                            }
                            else {
                                this.e = -1;
                            }
                        }
                    }
                    else {
                        this.e = obtainStyledAttributes.getInteger(index, this.e);
                    }
                }
                else if (index == 4) {
                    if ((this.h = obtainStyledAttributes.getInt(index, this.h)) < 8) {
                        this.h = 8;
                    }
                }
                else if (index == 8) {
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                }
                else if (index == 1) {
                    this.n = obtainStyledAttributes.getInteger(index, this.n);
                }
                else if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                }
                else if (index == 9) {
                    this.o = obtainStyledAttributes.getBoolean(index, this.o);
                }
                else if (index == 7) {
                    this.p = obtainStyledAttributes.getInteger(index, -1);
                }
                else if (index == 5) {
                    this.q = obtainStyledAttributes.getInteger(index, 0);
                }
                else if (index == 10) {
                    this.r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            obtainStyledAttributes.recycle();
        }
        
        public b(final irh j, final b b) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<ope>();
            this.l = null;
            this.m = new ArrayList<a>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = j;
            this.h = j.j;
            if (b != null) {
                this.p = b.p;
                this.e = b.e;
                this.f = b.f;
                this.g = b.g;
                this.h = b.h;
                this.k = b.k;
                this.i = b.i;
                this.q = b.q;
            }
        }
        
        public final boolean a(final int n) {
            return (n & this.r) != 0x0;
        }
        
        public static final class a implements View$OnClickListener
        {
            public final b D0;
            public int E0;
            public int F0;
            
            public a(final Context context, final b d0, final XmlPullParser xmlPullParser) {
                this.E0 = -1;
                this.F0 = 17;
                this.D0 = d0;
                final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), as2.e1);
                for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                    final int index = obtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.E0 = obtainStyledAttributes.getResourceId(index, this.E0);
                    }
                    else if (index == 0) {
                        this.F0 = obtainStyledAttributes.getInt(index, this.F0);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            
            public final void a(erh viewById, final int n, final b b) {
                final int e0 = this.E0;
                if (e0 != -1) {
                    viewById = (erh)((View)viewById).findViewById(e0);
                }
                if (viewById == null) {
                    final StringBuilder j = fu8.j("OnClick could not find id ");
                    j.append(this.E0);
                    Log.e("MotionScene", j.toString());
                    return;
                }
                final int d = b.d;
                final int c = b.c;
                if (d == -1) {
                    ((View)viewById).setOnClickListener((View$OnClickListener)this);
                    return;
                }
                final int f0 = this.F0;
                final int n2 = f0 & 0x1;
                final boolean b2 = false;
                final boolean b3 = n2 != 0 && n == d;
                final boolean b4 = (f0 & 0x100) != 0x0 && n == d;
                final boolean b5 = n2 != 0 && n == d;
                final boolean b6 = (f0 & 0x10) != 0x0 && n == c;
                boolean b7 = b2;
                if ((f0 & 0x1000) != 0x0) {
                    b7 = b2;
                    if (n == c) {
                        b7 = true;
                    }
                }
                if (b5 | (b3 | b4) | b6 | b7) {
                    ((View)viewById).setOnClickListener((View$OnClickListener)this);
                }
            }
            
            public final void b(final erh erh) {
                final int e0 = this.E0;
                if (e0 == -1) {
                    return;
                }
                final View viewById = ((View)erh).findViewById(e0);
                if (viewById == null) {
                    final StringBuilder j = fu8.j(" (*)  could not find id ");
                    j.append(this.E0);
                    Log.e("MotionScene", j.toString());
                    return;
                }
                viewById.setOnClickListener((View$OnClickListener)null);
            }
            
            public final void onClick(final View view) {
                final b d0 = this.D0;
                final irh j = d0.j;
                final erh a = j.a;
                if (!a.e1) {
                    return;
                }
                if (d0.d != -1) {
                    final b c = j.c;
                    final int f0 = this.F0;
                    final boolean b = false;
                    final boolean b2 = (f0 & 0x1) != 0x0 || (f0 & 0x100) != 0x0;
                    final boolean b3 = (f0 & 0x10) != 0x0 || (f0 & 0x1000) != 0x0;
                    final boolean b4 = b2 && b3;
                    boolean b5 = b3;
                    boolean b6 = b2;
                    if (b4) {
                        if (c != d0) {
                            a.setTransition(d0);
                        }
                        if (a.getCurrentState() != a.getEndState() && a.getProgress() <= 0.5f) {
                            b5 = false;
                            b6 = b2;
                        }
                        else {
                            b6 = false;
                            b5 = b3;
                        }
                    }
                    final b d2 = this.D0;
                    int n = 0;
                    Label_0323: {
                        if (d2 != c) {
                            final int c2 = d2.c;
                            final int d3 = d2.d;
                            if (d3 == -1) {
                                n = (b ? 1 : 0);
                                if (a.a1 == c2) {
                                    break Label_0323;
                                }
                            }
                            else {
                                final int a2 = a.a1;
                                if (a2 != d3) {
                                    n = (b ? 1 : 0);
                                    if (a2 != c2) {
                                        break Label_0323;
                                    }
                                }
                            }
                        }
                        n = 1;
                    }
                    if (n != 0) {
                        if (b6 && (this.F0 & 0x1) != 0x0) {
                            a.setTransition(d2);
                            a.P();
                        }
                        else if (b5 && (this.F0 & 0x10) != 0x0) {
                            a.setTransition(d2);
                            a.A(0.0f);
                        }
                        else if (b6 && (this.F0 & 0x100) != 0x0) {
                            a.setTransition(d2);
                            a.setProgress(1.0f);
                        }
                        else if (b5 && (this.F0 & 0x1000) != 0x0) {
                            a.setTransition(d2);
                            a.setProgress(0.0f);
                        }
                    }
                    return;
                }
                final int currentState = a.getCurrentState();
                if (currentState == -1) {
                    a.Q(this.D0.c);
                    return;
                }
                final b d4 = this.D0;
                final b transition = new b(d4.j, d4);
                transition.d = currentState;
                transition.c = this.D0.c;
                a.setTransition(transition);
                a.P();
            }
        }
    }
}
