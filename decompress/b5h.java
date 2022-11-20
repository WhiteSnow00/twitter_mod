import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g$a;
import android.view.ActionProvider$VisibilityListener;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ActionProvider;
import android.content.Context;
import java.lang.reflect.Method;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b5h extends mn1 implements MenuItem
{
    public final kzr d;
    public Method e;
    
    public b5h(final Context context, final kzr d) {
        super(context);
        if (d != null) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public final boolean collapseActionView() {
        return this.d.collapseActionView();
    }
    
    public final boolean expandActionView() {
        return this.d.expandActionView();
    }
    
    public final ActionProvider getActionProvider() {
        final xk b = this.d.b();
        if (b instanceof a) {
            return ((a)b).b;
        }
        return null;
    }
    
    public final View getActionView() {
        View actionView;
        final View view = actionView = this.d.getActionView();
        if (view instanceof c) {
            actionView = (View)((c)view).D0;
        }
        return actionView;
    }
    
    public final int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }
    
    public final char getAlphabeticShortcut() {
        return ((MenuItem)this.d).getAlphabeticShortcut();
    }
    
    public final CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }
    
    public final int getGroupId() {
        return ((MenuItem)this.d).getGroupId();
    }
    
    public final Drawable getIcon() {
        return ((MenuItem)this.d).getIcon();
    }
    
    public final ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }
    
    public final PorterDuff$Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }
    
    public final Intent getIntent() {
        return ((MenuItem)this.d).getIntent();
    }
    
    public final int getItemId() {
        return ((MenuItem)this.d).getItemId();
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return ((MenuItem)this.d).getMenuInfo();
    }
    
    public final int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }
    
    public final char getNumericShortcut() {
        return ((MenuItem)this.d).getNumericShortcut();
    }
    
    public final int getOrder() {
        return ((MenuItem)this.d).getOrder();
    }
    
    public final SubMenu getSubMenu() {
        return this.e(((MenuItem)this.d).getSubMenu());
    }
    
    public final CharSequence getTitle() {
        return ((MenuItem)this.d).getTitle();
    }
    
    public final CharSequence getTitleCondensed() {
        return ((MenuItem)this.d).getTitleCondensed();
    }
    
    public final CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }
    
    public final boolean hasSubMenu() {
        return ((MenuItem)this.d).hasSubMenu();
    }
    
    public final boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }
    
    public final boolean isCheckable() {
        return ((MenuItem)this.d).isCheckable();
    }
    
    public final boolean isChecked() {
        return ((MenuItem)this.d).isChecked();
    }
    
    public final boolean isEnabled() {
        return ((MenuItem)this.d).isEnabled();
    }
    
    public final boolean isVisible() {
        return ((MenuItem)this.d).isVisible();
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        final b b = new b((Context)super.a, actionProvider);
        final kzr d = this.d;
        b b2;
        if (actionProvider != null) {
            b2 = b;
        }
        else {
            b2 = null;
        }
        d.a(b2);
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final int actionView) {
        this.d.setActionView(actionView);
        final View actionView2 = this.d.getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            this.d.setActionView((View)new c(actionView2));
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setActionView(final View view) {
        Object actionView = view;
        if (view instanceof CollapsibleActionView) {
            actionView = new c(view);
        }
        this.d.setActionView((View)actionView);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        ((MenuItem)this.d).setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.d.setAlphabeticShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean checkable) {
        ((MenuItem)this.d).setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean checked) {
        ((MenuItem)this.d).setChecked(checked);
        return (MenuItem)this;
    }
    
    public final MenuItem setContentDescription(final CharSequence contentDescription) {
        this.d.setContentDescription(contentDescription);
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean enabled) {
        ((MenuItem)this.d).setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int icon) {
        ((MenuItem)this.d).setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable icon) {
        ((MenuItem)this.d).setIcon(icon);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintList(final ColorStateList iconTintList) {
        this.d.setIconTintList(iconTintList);
        return (MenuItem)this;
    }
    
    public final MenuItem setIconTintMode(final PorterDuff$Mode iconTintMode) {
        this.d.setIconTintMode(iconTintMode);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent intent) {
        ((MenuItem)this.d).setIntent(intent);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char numericShortcut) {
        ((MenuItem)this.d).setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c, final int n) {
        this.d.setNumericShortcut(c, n);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        final kzr d = this.d;
        Object onActionExpandListener;
        if (menuItem$OnActionExpandListener != null) {
            onActionExpandListener = new b5h.b5h$d(this, menuItem$OnActionExpandListener);
        }
        else {
            onActionExpandListener = null;
        }
        ((MenuItem)d).setOnActionExpandListener((MenuItem$OnActionExpandListener)onActionExpandListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        final kzr d = this.d;
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new b5h.b5h$e(this, menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        ((MenuItem)d).setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        ((MenuItem)this.d).setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.d.setShortcut(c, c2, n, n2);
        return (MenuItem)this;
    }
    
    public final void setShowAsAction(final int showAsAction) {
        this.d.setShowAsAction(showAsAction);
    }
    
    public final MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        this.d.setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final int title) {
        ((MenuItem)this.d).setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence title) {
        ((MenuItem)this.d).setTitle(title);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        ((MenuItem)this.d).setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public final MenuItem setTooltipText(final CharSequence tooltipText) {
        this.d.setTooltipText(tooltipText);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean visible) {
        return ((MenuItem)this.d).setVisible(visible);
    }
    
    public class a extends xk
    {
        public final ActionProvider b;
        public final b5h c;
        
        public a(final b5h c, final Context context, final ActionProvider b) {
            this.c = c;
            this.b = b;
        }
        
        public final boolean a() {
            return this.b.hasSubMenu();
        }
        
        public final View c() {
            return this.b.onCreateActionView();
        }
        
        public final boolean e() {
            return this.b.onPerformDefaultAction();
        }
        
        public final void f(final SubMenu subMenu) {
            this.b.onPrepareSubMenu(this.c.e(subMenu));
        }
    }
    
    public final class b extends a implements ActionProvider$VisibilityListener
    {
        public xk$a d;
        
        public b(final b5h b5h, final Context context, final ActionProvider actionProvider) {
            b5h.super(context, actionProvider);
        }
        
        public final boolean b() {
            return super.b.isVisible();
        }
        
        public final View d(final MenuItem menuItem) {
            return super.b.onCreateActionView(menuItem);
        }
        
        public final boolean g() {
            return super.b.overridesItemVisibility();
        }
        
        public final void h(final xk$a d) {
            this.d = d;
            super.b.setVisibilityListener((ActionProvider$VisibilityListener)this);
        }
        
        public final void onActionProviderVisibilityChanged(final boolean b) {
            final xk$a d = this.d;
            if (d != null) {
                final e n = ((g$a)d).a.n;
                n.r(n.h = true);
            }
        }
    }
    
    public static final class c extends FrameLayout implements fp4
    {
        public final CollapsibleActionView D0;
        
        public c(final View view) {
            super(view.getContext());
            this.D0 = (CollapsibleActionView)view;
            ((ViewGroup)this).addView(view);
        }
        
        public final void a() {
            this.D0.onActionViewExpanded();
        }
        
        public final void e() {
            this.D0.onActionViewCollapsed();
        }
    }
}
