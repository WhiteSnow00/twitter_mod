// 
// Decompiled by Procyon v0.6.0
// 

public enum waa
{
    D0("app_store_details"), 
    E0("image"), 
    F0("video"), 
    G0("details"), 
    H0("product_details"), 
    I0("commerce_drop_details"), 
    J0("commerce_product"), 
    K0("commerce_shop"), 
    L0("button_group"), 
    M0("follow_button"), 
    N0("swipeable_media"), 
    O0("profile"), 
    P0("twitter_list_details"), 
    Q0("media_gallery"), 
    R0("media_with_details_horizontal"), 
    S0("community_details"), 
    T0("product_explorer"), 
    U0("model3d"), 
    V0("selector"), 
    W0("multi_button"), 
    X0("profile_banner"), 
    Y0("non_native_app_store_details"), 
    Z0("non_native_image"), 
    a1("spine"), 
    b1("destination_overlay"), 
    c1("facepile"), 
    d1("unknown"), 
    e1("none");
    
    public final String C0;
    
    public waa(final String c0) {
        this.C0 = c0;
    }
    
    public final String b() {
        return l7k.c("uc_", this.C0);
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
}
