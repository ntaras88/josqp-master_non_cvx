package com.quantego.josqp;



public class DataGenerator_Lin_Alg
{
    public static class lin_alg_sols_data
    {
        public CSCMatrix test_sp_matrix_A;
        public double []test_sp_matrix_Adns;
        public  int test_vec_ops_n;
        public double []test_vec_ops_v1;
        public double []test_vec_ops_v2;
        public double test_vec_ops_sc;
        public double test_vec_ops_norm_inf;
        public double test_vec_ops_norm_inf_diff;
        public double []test_vec_ops_add_scaled;
        public double  []test_vec_ops_ew_reciprocal;
        public double test_vec_ops_vec_prod;
        public double  []test_vec_ops_ew_max_vec;
        public double  []test_vec_ops_ew_min_vec;
        public int  test_mat_ops_n;
        public CSCMatrix test_mat_ops_A;
        public double  []test_mat_ops_d;
        public CSCMatrix test_mat_ops_prem_diag;
        public CSCMatrix test_mat_ops_postm_diag;
        public double  []test_mat_ops_inf_norm_cols;
        public double  []test_mat_ops_inf_norm_rows;
        public int test_mat_vec_n;
        public int test_mat_vec_m;
        public CSCMatrix test_mat_vec_A;
        public CSCMatrix test_mat_vec_Pu;
        public double  []test_mat_vec_x;
        public double  []test_mat_vec_y;
        public double  []test_mat_vec_Ax;
        public double  []test_mat_vec_Ax_cum;
        public double  []test_mat_vec_ATy;
        public double  []test_mat_vec_ATy_cum;
        public double  []test_mat_vec_Px;
        public double  []test_mat_vec_Px_cum;
        public int test_mat_extr_triu_n;
        public CSCMatrix test_mat_extr_triu_P;
        public CSCMatrix test_mat_extr_triu_Pu;
        public double  []test_mat_extr_triu_P_inf_norm_cols;
        public int test_qpform_n;
        public CSCMatrix test_qpform_Pu;
        public double  []test_qpform_x;
        public double test_qpform_value;
        public lin_alg_sols_data()
        {
        }


    };
   // lin_alg_sols_data A   generate_problem_lin_alg_sols_data();
    public static lin_alg_sols_data generate_problem_lin_alg_sols_data(){
        lin_alg_sols_data data = new  lin_alg_sols_data();
        data.test_sp_matrix_A = new CSCMatrix(5,6,30,new int[7],new int[30], new double[30]);
        data.test_sp_matrix_A.Ax[0] = -1.42121722730412680669;
        data.test_sp_matrix_A.Ax[1] = 0.37044453666323423624;
        data.test_sp_matrix_A.Ax[2] = -0.31350819699340887192;
        data.test_sp_matrix_A.Ax[3] = 1.61134077957371735224;
        data.test_sp_matrix_A.Ax[4] = -0.37566942307899364728;
        data.test_sp_matrix_A.Ax[5] = -0.15349519567694913658;
        data.test_sp_matrix_A.Ax[6] = 1.35963386267259611628;
        data.test_sp_matrix_A.Ax[7] = 0.77101173806941147859;
        data.test_sp_matrix_A.Ax[8] = 0.04797059186818837528;
        data.test_sp_matrix_A.Ax[9] = -0.07447076289398098237;
        data.test_sp_matrix_A.Ax[10] = -0.26905696021601349655;
        data.test_sp_matrix_A.Ax[11] = 0.50185720678131329198;
        data.test_sp_matrix_A.Ax[12] = -1.86809065456376344194;
        data.test_sp_matrix_A.Ax[13] = -0.82913528901477873134;
        data.test_sp_matrix_A.Ax[14] = 0.43349633007657084605;
        data.test_sp_matrix_A.Ax[15] = 2.23136678888660444642;
        data.test_sp_matrix_A.Ax[16] = -0.84421370382986182790;
        data.test_sp_matrix_A.Ax[17] = 1.73118466598046794047;
        data.test_sp_matrix_A.Ax[18] = 0.08771021840833141681;
        data.test_sp_matrix_A.Ax[19] = 1.27837923027186817215;
        data.test_sp_matrix_A.Ax[20] = -2.43476757652104414120;
        data.test_sp_matrix_A.Ax[21] = 0.00000976147159609348;
        data.test_sp_matrix_A.Ax[22] = 2.46767801057341262805;
        data.test_sp_matrix_A.Ax[23] = 1.00036588655069502707;
        data.test_sp_matrix_A.Ax[24] = -0.63467930517936232970;
        data.test_sp_matrix_A.Ax[25] = 0.11272650481664892030;
        data.test_sp_matrix_A.Ax[26] = 0.54235257214902909961;
        data.test_sp_matrix_A.Ax[27] = -0.33567733852384745719;
        data.test_sp_matrix_A.Ax[28] = -0.38109251751534994890;
        data.test_sp_matrix_A.Ax[29] = 0.50839624268343175384;
        //data.test_sp_matrix_A.i = (c_int*) c_malloc(30 * sizeof(c_int));
        data.test_sp_matrix_A.Ai[0] = 0;
        data.test_sp_matrix_A.Ai[1] = 1;
        data.test_sp_matrix_A.Ai[2] = 2;
        data.test_sp_matrix_A.Ai[3] = 3;
        data.test_sp_matrix_A.Ai[4] = 4;
        data.test_sp_matrix_A.Ai[5] = 0;
        data.test_sp_matrix_A.Ai[6] = 1;
        data.test_sp_matrix_A.Ai[7] = 2;
        data.test_sp_matrix_A.Ai[8] = 3;
        data.test_sp_matrix_A.Ai[9] = 4;
        data.test_sp_matrix_A.Ai[10] = 0;
        data.test_sp_matrix_A.Ai[11] = 1;
        data.test_sp_matrix_A.Ai[12] = 2;
        data.test_sp_matrix_A.Ai[13] = 3;
        data.test_sp_matrix_A.Ai[14] = 4;
        data.test_sp_matrix_A.Ai[15] = 0;
        data.test_sp_matrix_A.Ai[16] = 1;
        data.test_sp_matrix_A.Ai[17] = 2;
        data.test_sp_matrix_A.Ai[18] = 3;
        data.test_sp_matrix_A.Ai[19] = 4;
        data.test_sp_matrix_A.Ai[20] = 0;
        data.test_sp_matrix_A.Ai[21] = 1;
        data.test_sp_matrix_A.Ai[22] = 2;
        data.test_sp_matrix_A.Ai[23] = 3;
        data.test_sp_matrix_A.Ai[24] = 4;
        data.test_sp_matrix_A.Ai[25] = 0;
        data.test_sp_matrix_A.Ai[26] = 1;
        data.test_sp_matrix_A.Ai[27] = 2;
        data.test_sp_matrix_A.Ai[28] = 3;
        data.test_sp_matrix_A.Ai[29] = 4;
       // data.test_sp_matrix_A.Ap = (c_int*) c_malloc((6 + 1) * sizeof(c_int));
        data.test_sp_matrix_A.Ap[0] = 0;
        data.test_sp_matrix_A.Ap[1] = 5;
        data.test_sp_matrix_A.Ap[2] = 10;
        data.test_sp_matrix_A.Ap[3] = 15;
        data.test_sp_matrix_A.Ap[4] = 20;
        data.test_sp_matrix_A.Ap[5] = 25;
        data.test_sp_matrix_A.Ap[6] = 30;

        data.test_sp_matrix_Adns = new double[30];
        data.test_sp_matrix_Adns[0] = -1.42121722730412680669;
        data.test_sp_matrix_Adns[1] = 0.37044453666323423624;
        data.test_sp_matrix_Adns[2] = -0.31350819699340887192;
        data.test_sp_matrix_Adns[3] = 1.61134077957371735224;
        data.test_sp_matrix_Adns[4] = -0.37566942307899364728;
        data.test_sp_matrix_Adns[5] = -0.15349519567694913658;
        data.test_sp_matrix_Adns[6] = 1.35963386267259611628;
        data.test_sp_matrix_Adns[7] = 0.77101173806941147859;
        data.test_sp_matrix_Adns[8] = 0.04797059186818837528;
        data.test_sp_matrix_Adns[9] = -0.07447076289398098237;
        data.test_sp_matrix_Adns[10] = -0.26905696021601349655;
        data.test_sp_matrix_Adns[11] = 0.50185720678131329198;
        data.test_sp_matrix_Adns[12] = -1.86809065456376344194;
        data.test_sp_matrix_Adns[13] = -0.82913528901477873134;
        data.test_sp_matrix_Adns[14] = 0.43349633007657084605;
        data.test_sp_matrix_Adns[15] = 2.23136678888660444642;
        data.test_sp_matrix_Adns[16] = -0.84421370382986182790;
        data.test_sp_matrix_Adns[17] = 1.73118466598046794047;
        data.test_sp_matrix_Adns[18] = 0.08771021840833141681;
        data.test_sp_matrix_Adns[19] = 1.27837923027186817215;
        data.test_sp_matrix_Adns[20] = -2.43476757652104414120;
        data.test_sp_matrix_Adns[21] = 0.00000976147159609348;
        data.test_sp_matrix_Adns[22] = 2.46767801057341262805;
        data.test_sp_matrix_Adns[23] = 1.00036588655069502707;
        data.test_sp_matrix_Adns[24] = -0.63467930517936232970;
        data.test_sp_matrix_Adns[25] = 0.11272650481664892030;
        data.test_sp_matrix_Adns[26] = 0.54235257214902909961;
        data.test_sp_matrix_Adns[27] = -0.33567733852384745719;
        data.test_sp_matrix_Adns[28] = -0.38109251751534994890;
        data.test_sp_matrix_Adns[29] = 0.50839624268343175384;
        data.test_vec_ops_n = 10;
        data.test_vec_ops_v1 = new double [10];
        data.test_vec_ops_v1[0] = 0.21611600626368202005;
        data.test_vec_ops_v1[1] = -1.85861238612349755073;
        data.test_vec_ops_v1[2] = -0.41931648215268885194;
        data.test_vec_ops_v1[3] = -0.13232889843674336405;
        data.test_vec_ops_v1[4] = -0.03957023969360570076;
        data.test_vec_ops_v1[5] = 0.32600343338698062334;
        data.test_vec_ops_v1[6] = -2.04032304872871517176;
        data.test_vec_ops_v1[7] = 0.04625552314169690399;
        data.test_vec_ops_v1[8] = -0.67767557732804151183;
        data.test_vec_ops_v1[9] = -1.43943902673861812147;
        data.test_vec_ops_v2 = new double[10];
        data.test_vec_ops_v2[0] = 0.52429643001034864636;
        data.test_vec_ops_v2[1] = 0.73527957606520255585;
        data.test_vec_ops_v2[2] = -0.65325026779203565486;
        data.test_vec_ops_v2[3] = 0.84245628157134011538;
        data.test_vec_ops_v2[4] = -0.38151648176508617949;
        data.test_vec_ops_v2[5] = 0.06648900914614486179;
        data.test_vec_ops_v2[6] = -1.09873894699605645364;
        data.test_vec_ops_v2[7] = 1.58448705639567632986;
        data.test_vec_ops_v2[8] = -2.65944945638348828609;
        data.test_vec_ops_v2[9] = -0.09145262289065814176;
        data.test_vec_ops_sc = 0.69511960504699144003;
        data.test_vec_ops_norm_inf = 2.04032304872871517176;
        data.test_vec_ops_norm_inf_diff = 2.59389196218869999555;
        data.test_vec_ops_add_scaled = new double[10];
        data.test_vec_ops_add_scaled[0] = 0.58056473362002314342;
        data.test_vec_ops_add_scaled[1] = -1.34750513760993451129;
        data.test_vec_ops_add_scaled[2] = -0.87340355029713001578;
        data.test_vec_ops_add_scaled[3] = 0.45327897927848359583;
        data.test_vec_ops_add_scaled[4] = -0.30476982581707007247;
        data.test_vec_ops_add_scaled[5] = 0.37222124716461463256;
        data.test_vec_ops_add_scaled[6] = -2.80407803161436142148;
        data.test_vec_ops_add_scaled[7] = 1.14766353998552950166;
        data.test_vec_ops_add_scaled[8] = -2.52631103309176818783;
        data.test_vec_ops_add_scaled[9] = -1.50300953784288382487;
        data.test_vec_ops_ew_reciprocal = new double[10];
        data.test_vec_ops_ew_reciprocal[0] = 4.62714454745154402104;
        data.test_vec_ops_ew_reciprocal[1] = -0.53803579889279495863;
        data.test_vec_ops_ew_reciprocal[2] = -2.38483351492933337568;
        data.test_vec_ops_ew_reciprocal[3] = -7.55692831885867999375;
        data.test_vec_ops_ew_reciprocal[4] = -25.27151737626683214444;
        data.test_vec_ops_ew_reciprocal[5] = 3.06745235659207127199;
        data.test_vec_ops_ew_reciprocal[6] = -0.49011846463386282702;
        data.test_vec_ops_ew_reciprocal[7] = 21.61903989144494175889;
        data.test_vec_ops_ew_reciprocal[8] = -1.47563234304949930653;
        data.test_vec_ops_ew_reciprocal[9] = -0.69471508096159595436;
        data.test_vec_ops_vec_prod = 3.19487685565542900434;
        data.test_vec_ops_ew_max_vec = new double[10];
        data.test_vec_ops_ew_max_vec[0] = 0.52429643001034864636;
        data.test_vec_ops_ew_max_vec[1] = 0.73527957606520255585;
        data.test_vec_ops_ew_max_vec[2] = -0.41931648215268885194;
        data.test_vec_ops_ew_max_vec[3] = 0.84245628157134011538;
        data.test_vec_ops_ew_max_vec[4] = -0.03957023969360570076;
        data.test_vec_ops_ew_max_vec[5] = 0.32600343338698062334;
        data.test_vec_ops_ew_max_vec[6] = -1.09873894699605645364;
        data.test_vec_ops_ew_max_vec[7] = 1.58448705639567632986;
        data.test_vec_ops_ew_max_vec[8] = -0.67767557732804151183;
        data.test_vec_ops_ew_max_vec[9] = -0.09145262289065814176;
        data.test_vec_ops_ew_min_vec = new double[10];
        data.test_vec_ops_ew_min_vec[0] = 0.21611600626368202005;
        data.test_vec_ops_ew_min_vec[1] = -1.85861238612349755073;
        data.test_vec_ops_ew_min_vec[2] = -0.65325026779203565486;
        data.test_vec_ops_ew_min_vec[3] = -0.13232889843674336405;
        data.test_vec_ops_ew_min_vec[4] = -0.38151648176508617949;
        data.test_vec_ops_ew_min_vec[5] = 0.06648900914614486179;
        data.test_vec_ops_ew_min_vec[6] = -2.04032304872871517176;
        data.test_vec_ops_ew_min_vec[7] = 0.04625552314169690399;
        data.test_vec_ops_ew_min_vec[8] = -2.65944945638348828609;
        data.test_vec_ops_ew_min_vec[9] = -1.43943902673861812147;
        data.test_mat_ops_n = 2;
        // Matrix test_mat_ops_A
//----------------------
        data.test_mat_ops_A = new CSCMatrix(2,2,3,new int[3],new int[3], new double[3]);;
        
        data.test_mat_ops_A.Ax[0] = 0.04179770981531005791;
        data.test_mat_ops_A.Ax[1] = 0.31325852842971357859;
        data.test_mat_ops_A.Ax[2] = 0.73839975862090034830;
        data.test_mat_ops_A.Ai[0] = 0;
        data.test_mat_ops_A.Ai[1] = 1;
        data.test_mat_ops_A.Ai[2] = 0;
        //data.test_mat_ops_A.p = (c_int*) c_malloc((2 + 1) * sizeof(c_int));
        data.test_mat_ops_A.Ap[0] = 0;
        data.test_mat_ops_A.Ap[1] = 2;
        data.test_mat_ops_A.Ap[2] = 3;

        data.test_mat_ops_d = new double[2];
        data.test_mat_ops_d[0] = -2.03346654612261357187;
        data.test_mat_ops_d[1] = -1.14533805578424119354;

        // Matrix test_mat_ops_prem_diag
        //------------------------------
        data.test_mat_ops_prem_diag = new CSCMatrix(2,2,3,new int[3],new int[3], new double[3]);;
        data.test_mat_ops_prem_diag.Ax[0] = -0.08499424461397381281;
        data.test_mat_ops_prem_diag.Ax[1] = -0.35878691390952061058;
        data.test_mat_ops_prem_diag.Ax[2] = -1.50151120682061378631;
        //data.test_mat_ops_prem_diag.Ai = (c_int*) c_malloc(3 * sizeof(c_int));
        data.test_mat_ops_prem_diag.Ai[0] = 0;
        data.test_mat_ops_prem_diag.Ai[1] = 1;
        data.test_mat_ops_prem_diag.Ai[2] = 0;
        //data.test_mat_ops_prem_diag.p = (c_int*) c_malloc((2 + 1) * sizeof(c_int));
        data.test_mat_ops_prem_diag.Ap[0] = 0;
        data.test_mat_ops_prem_diag.Ap[1] = 2;
        data.test_mat_ops_prem_diag.Ap[2] = 3;


        // Matrix test_mat_ops_postm_diag
        //-------------------------------
        data.test_mat_ops_postm_diag = new CSCMatrix(2,2,3,new int[3],new int[3], new double[3]);
        data.test_mat_ops_postm_diag.Ax[0] = -0.08499424461397381281;
        data.test_mat_ops_postm_diag.Ax[1] = -0.63700073784942223831;
        data.test_mat_ops_postm_diag.Ax[2] = -0.84571734393041497757;
        data.test_mat_ops_postm_diag.Ai[0] = 0;
        data.test_mat_ops_postm_diag.Ai[1] = 1;
        data.test_mat_ops_postm_diag.Ai[2] = 0;
        //data.test_mat_ops_postm_diag.Ap = (c_int*) c_malloc((2 + 1) * sizeof(c_int));
        data.test_mat_ops_postm_diag.Ap[0] = 0;
        data.test_mat_ops_postm_diag.Ap[1] = 2;
        data.test_mat_ops_postm_diag.Ap[2] = 3;

        data.test_mat_ops_inf_norm_cols = new double[2];
        data.test_mat_ops_inf_norm_cols[0] = 0.31325852842971357859;
        data.test_mat_ops_inf_norm_cols[1] = 0.73839975862090034830;
        data.test_mat_ops_inf_norm_rows = new double[2];
        data.test_mat_ops_inf_norm_rows[0] = 0.73839975862090034830;
        data.test_mat_ops_inf_norm_rows[1] = 0.31325852842971357859;
        data.test_mat_vec_n = 4;
        data.test_mat_vec_m = 5;

        // Matrix test_mat_vec_A
        //----------------------
        data.test_mat_vec_A = new CSCMatrix(5,4,20,new int[5],new int[20], new double[20]);
     
        //data.test_mat_vec_A.x = new double[20]
       data.test_mat_vec_A.Ax[0] = 0.62935972282958219104;
       data.test_mat_vec_A.Ax[1] = 0.54790778009037666152;
        data.test_mat_vec_A.Ax[2] = 0.18662714558648019203;
        data.test_mat_vec_A.Ax[3] = 0.48926616699485914186;
        data.test_mat_vec_A.Ax[4] = 0.91391547716513199529;
        data.test_mat_vec_A.Ax[5] = 0.24581116390413071393;
        data.test_mat_vec_A.Ax[6] = 0.54019151566713086154;
        data.test_mat_vec_A.Ax[7] = 0.60844215780504962154;
        data.test_mat_vec_A.Ax[8] = 0.41973546130682071187;
        data.test_mat_vec_A.Ax[9] = 0.82624982843415795131;
        data.test_mat_vec_A.Ax[10] = 0.11058314779616107426;
        data.test_mat_vec_A.Ax[11] = 0.27405925253605367686;
        data.test_mat_vec_A.Ax[12] = 0.59125735265354584236;
        data.test_mat_vec_A.Ax[13] = 0.34623790945514643091;
        data.test_mat_vec_A.Ax[14] = 0.29517230521974247015;
        data.test_mat_vec_A.Ax[15] = 0.69952061979054813712;
        data.test_mat_vec_A.Ax[16] = 0.01025003939959090449;
        data.test_mat_vec_A.Ax[17] = 0.17671216158442604183;
        data.test_mat_vec_A.Ax[18] = 0.62356318456213077894;
        data.test_mat_vec_A.Ax[19] = 0.26377852928001976895;
        data.test_mat_vec_A.Ai[0] = 0;
        data.test_mat_vec_A.Ai[1] = 1;
        data.test_mat_vec_A.Ai[2] = 2;
        data.test_mat_vec_A.Ai[3] = 3;
        data.test_mat_vec_A.Ai[4] = 4;
        data.test_mat_vec_A.Ai[5] = 0;
        data.test_mat_vec_A.Ai[6] = 1;
        data.test_mat_vec_A.Ai[7] = 2;
        data.test_mat_vec_A.Ai[8] = 3;
        data.test_mat_vec_A.Ai[9] = 4;
        data.test_mat_vec_A.Ai[10] = 0;
        data.test_mat_vec_A.Ai[11] = 1;
        data.test_mat_vec_A.Ai[12] = 2;
        data.test_mat_vec_A.Ai[13] = 3;
        data.test_mat_vec_A.Ai[14] = 4;
        data.test_mat_vec_A.Ai[15] = 0;
        data.test_mat_vec_A.Ai[16] = 1;
        data.test_mat_vec_A.Ai[17] = 2;
        data.test_mat_vec_A.Ai[18] = 3;
        data.test_mat_vec_A.Ai[19] = 4;
        data.test_mat_vec_A.Ap[0] = 0;
        data.test_mat_vec_A.Ap[1] = 5;
        data.test_mat_vec_A.Ap[2] = 10;
        data.test_mat_vec_A.Ap[3] = 15;
        data.test_mat_vec_A.Ap[4] = 20;


        // Matrix test_mat_vec_Pu
        //-----------------------
        data.test_mat_vec_Pu = new CSCMatrix(4,4,9,new int[5],new int[9], new double[9]);
        data.test_mat_vec_Pu.Ax[0] = 0.43857994482138584758;
        data.test_mat_vec_Pu.Ax[1] = 0.83651764852853427445;
        data.test_mat_vec_Pu.Ax[2] = 0.97447737597704364720;
        data.test_mat_vec_Pu.Ax[3] = 1.00661727616937901608;
        data.test_mat_vec_Pu.Ax[4] = 1.01082326817688716858;
        data.test_mat_vec_Pu.Ax[5] = 0.01827003127010540240;
        data.test_mat_vec_Pu.Ax[6] = 0.38658285361775701627;
        data.test_mat_vec_Pu.Ax[7] = 0.54587270844450219709;
        data.test_mat_vec_Pu.Ax[8] = 1.24654467104204758066;
       // data.test_mat_vec_Pu.Ai = (c_int*) c_malloc(9 * sizeof(c_int));
        data.test_mat_vec_Pu.Ai[0] = 0;
        data.test_mat_vec_Pu.Ai[1] = 0;
        data.test_mat_vec_Pu.Ai[2] = 0;
        data.test_mat_vec_Pu.Ai[3] = 1;
        data.test_mat_vec_Pu.Ai[4] = 2;
        data.test_mat_vec_Pu.Ai[5] = 0;
        data.test_mat_vec_Pu.Ai[6] = 1;
        data.test_mat_vec_Pu.Ai[7] = 2;
        data.test_mat_vec_Pu.Ai[8] = 3;
       // data.test_mat_vec_Pu.Ap = (c_int*) c_malloc((4 + 1) * sizeof(c_int));
        data.test_mat_vec_Pu.Ap[0] = 0;
        data.test_mat_vec_Pu.Ap[1] = 1;
        data.test_mat_vec_Pu.Ap[2] = 2;
        data.test_mat_vec_Pu.Ap[3] = 5;
        data.test_mat_vec_Pu.Ap[4] = 9;

        data.test_mat_vec_x = new double[4];
        data.test_mat_vec_x[0] = 0.63219176742504867850;
        data.test_mat_vec_x[1] = 0.77919639002551310814;
        data.test_mat_vec_x[2] = -0.20760769091876352110;
        data.test_mat_vec_x[3] = -0.47493593090922636701;
        data.test_mat_vec_y = new double[5];
        data.test_mat_vec_y[0] = -0.05053769326586431826;
        data.test_mat_vec_y[1] = 1.96231586074821984234;
        data.test_mat_vec_y[2] = -1.49139808547822494411;
        data.test_mat_vec_y[3] = -0.02272573072923615017;
        data.test_mat_vec_y[4] = 0.17340019433320591480;
        data.test_mat_vec_Ax = new double[5];
        data.test_mat_vec_Ax[0] = 0.23422581834492828268;
        data.test_mat_vec_Ax[1] = 0.70553314621347551494;
        data.test_mat_vec_Ax[2] = 0.38540354923061226344;
        data.test_mat_vec_Ax[3] = 0.26833218463846697510;
        data.test_mat_vec_Ax[4] = 1.03502278229391486697;
        data.test_mat_vec_Ax_cum = new double[5];
        data.test_mat_vec_Ax_cum[0] = 0.18368812507906395748;
        data.test_mat_vec_Ax_cum[1] = 2.66784900696169557932;
        data.test_mat_vec_Ax_cum[2] = -1.10599453624761268067;
        data.test_mat_vec_Ax_cum[3] = 0.24560645390923083187;
        data.test_mat_vec_Ax_cum[4] = 1.20842297662712083728;
        data.test_mat_vec_ATy = new double[4];
        data.test_mat_vec_ATy[0] = 0.91238056102500841860;
        data.test_mat_vec_ATy[1] = 0.27390726630491868399;
        data.test_mat_vec_ATy[2] = -0.30628345735146567108;
        data.test_mat_vec_ATy[3] = -0.24721820388368365151;
        data.test_mat_vec_ATy_cum = new double[4];
        data.test_mat_vec_ATy_cum[0] = 1.54457232845005698607;
        data.test_mat_vec_ATy_cum[1] = 1.05310365633043190314;
        data.test_mat_vec_ATy_cum[2] = -0.51389114827022919219;
        data.test_mat_vec_ATy_cum[3] = -0.72215413479291001853;
        data.test_mat_vec_Px = new double[4];
        data.test_mat_vec_Px[0] = 0.71809207021169918495;
        data.test_mat_vec_Px[1] = 0.13625599490454512464;
        data.test_mat_vec_Px[2] = 0.93129987478695408498;
        data.test_mat_vec_Px[3] = -0.39258209895274831513;
        data.test_mat_vec_Px_cum = new double[4];
        data.test_mat_vec_Px_cum[0] = 1.35028383763674786344;
        data.test_mat_vec_Px_cum[1] = 0.91545238493005820501;
        data.test_mat_vec_Px_cum[2] = 0.72369218386819056388;
        data.test_mat_vec_Px_cum[3] = -0.86751802986197468215;
        data.test_mat_extr_triu_n = 5;

        // Matrix test_mat_extr_triu_P
        //----------------------------
        data.test_mat_extr_triu_P = new CSCMatrix(5,5,24,new int[6],new int[24], new double[24]);
        data.test_mat_extr_triu_P.Ax[0] = 1.25636243709775197175;
        data.test_mat_extr_triu_P.Ax[1] = 0.46301878153105946456;
        data.test_mat_extr_triu_P.Ax[2] = 0.86736337930038920341;
        data.test_mat_extr_triu_P.Ax[3] = 0.35417242096340495472;
        data.test_mat_extr_triu_P.Ax[4] = 0.34609815153014733546;
        data.test_mat_extr_triu_P.Ax[5] = 0.46301878153105946456;
        data.test_mat_extr_triu_P.Ax[6] = 1.56060373790060746835;
        data.test_mat_extr_triu_P.Ax[7] = 0.82745335206725068034;
        data.test_mat_extr_triu_P.Ax[8] = 1.12964779320375763305;
        data.test_mat_extr_triu_P.Ax[9] = 0.83747221011704786608;
        data.test_mat_extr_triu_P.Ax[10] = 0.86736337930038920341;
        data.test_mat_extr_triu_P.Ax[11] = 0.82745335206725068034;
        data.test_mat_extr_triu_P.Ax[12] = 1.38118030249938827936;
        data.test_mat_extr_triu_P.Ax[13] = 1.01660609302193694070;
        data.test_mat_extr_triu_P.Ax[14] = 0.35417242096340495472;
        data.test_mat_extr_triu_P.Ax[15] = 1.12964779320375763305;
        data.test_mat_extr_triu_P.Ax[16] = 1.38118030249938827936;
        data.test_mat_extr_triu_P.Ax[17] = 0.95107793820572439358;
        data.test_mat_extr_triu_P.Ax[18] = 0.85846834258151383246;
        data.test_mat_extr_triu_P.Ax[19] = 0.34609815153014733546;
        data.test_mat_extr_triu_P.Ax[20] = 0.83747221011704786608;
        data.test_mat_extr_triu_P.Ax[21] = 1.01660609302193694070;
        data.test_mat_extr_triu_P.Ax[22] = 0.85846834258151383246;
        data.test_mat_extr_triu_P.Ax[23] = 1.07939560863581207606;
        //data.test_mat_extr_triu_P.Ai = (c_int*) c_malloc(24 * sizeof(c_int));
        data.test_mat_extr_triu_P.Ai[0] = 0;
        data.test_mat_extr_triu_P.Ai[1] = 1;
        data.test_mat_extr_triu_P.Ai[2] = 2;
        data.test_mat_extr_triu_P.Ai[3] = 3;
        data.test_mat_extr_triu_P.Ai[4] = 4;
        data.test_mat_extr_triu_P.Ai[5] = 0;
        data.test_mat_extr_triu_P.Ai[6] = 1;
        data.test_mat_extr_triu_P.Ai[7] = 2;
        data.test_mat_extr_triu_P.Ai[8] = 3;
        data.test_mat_extr_triu_P.Ai[9] = 4;
        data.test_mat_extr_triu_P.Ai[10] = 0;
        data.test_mat_extr_triu_P.Ai[11] = 1;
        data.test_mat_extr_triu_P.Ai[12] = 3;
        data.test_mat_extr_triu_P.Ai[13] = 4;
        data.test_mat_extr_triu_P.Ai[14] = 0;
        data.test_mat_extr_triu_P.Ai[15] = 1;
        data.test_mat_extr_triu_P.Ai[16] = 2;
        data.test_mat_extr_triu_P.Ai[17] = 3;
        data.test_mat_extr_triu_P.Ai[18] = 4;
        data.test_mat_extr_triu_P.Ai[19] = 0;
        data.test_mat_extr_triu_P.Ai[20] = 1;
        data.test_mat_extr_triu_P.Ai[21] = 2;
        data.test_mat_extr_triu_P.Ai[22] = 3;
        data.test_mat_extr_triu_P.Ai[23] = 4;
        //data.test_mat_extr_triu_P.Ap = (c_int*) c_malloc((5 + 1) * sizeof(c_int));
        data.test_mat_extr_triu_P.Ap[0] = 0;
        data.test_mat_extr_triu_P.Ap[1] = 5;
        data.test_mat_extr_triu_P.Ap[2] = 10;
        data.test_mat_extr_triu_P.Ap[3] = 14;
        data.test_mat_extr_triu_P.Ap[4] = 19;
        data.test_mat_extr_triu_P.Ap[5] = 24;


        // Matrix test_mat_extr_triu_Pu
        //-----------------------------
        data.test_mat_extr_triu_Pu = new CSCMatrix(5,5,14,new int[6],new int[14], new double[14]);
        data.test_mat_extr_triu_Pu.Ax[0] = 1.25636243709775197175;
        data.test_mat_extr_triu_Pu.Ax[1] = 0.46301878153105946456;
        data.test_mat_extr_triu_Pu.Ax[2] = 1.56060373790060746835;
        data.test_mat_extr_triu_Pu.Ax[3] = 0.86736337930038920341;
        data.test_mat_extr_triu_Pu.Ax[4] = 0.82745335206725068034;
        data.test_mat_extr_triu_Pu.Ax[5] = 0.35417242096340495472;
        data.test_mat_extr_triu_Pu.Ax[6] = 1.12964779320375763305;
        data.test_mat_extr_triu_Pu.Ax[7] = 1.38118030249938827936;
        data.test_mat_extr_triu_Pu.Ax[8] = 0.95107793820572439358;
        data.test_mat_extr_triu_Pu.Ax[9] = 0.34609815153014733546;
        data.test_mat_extr_triu_Pu.Ax[10] = 0.83747221011704786608;
        data.test_mat_extr_triu_Pu.Ax[11] = 1.01660609302193694070;
        data.test_mat_extr_triu_Pu.Ax[12] = 0.85846834258151383246;
        data.test_mat_extr_triu_Pu.Ax[13] = 1.07939560863581207606;
        data.test_mat_extr_triu_Pu.Ai[0] = 0;
        data.test_mat_extr_triu_Pu.Ai[1] = 0;
        data.test_mat_extr_triu_Pu.Ai[2] = 1;
        data.test_mat_extr_triu_Pu.Ai[3] = 0;
        data.test_mat_extr_triu_Pu.Ai[4] = 1;
        data.test_mat_extr_triu_Pu.Ai[5] = 0;
        data.test_mat_extr_triu_Pu.Ai[6] = 1;
        data.test_mat_extr_triu_Pu.Ai[7] = 2;
        data.test_mat_extr_triu_Pu.Ai[8] = 3;
        data.test_mat_extr_triu_Pu.Ai[9] = 0;
        data.test_mat_extr_triu_Pu.Ai[10] = 1;
        data.test_mat_extr_triu_Pu.Ai[11] = 2;
        data.test_mat_extr_triu_Pu.Ai[12] = 3;
        data.test_mat_extr_triu_Pu.Ai[13] = 4;
        data.test_mat_extr_triu_Pu.Ap[0] = 0;
        data.test_mat_extr_triu_Pu.Ap[1] = 1;
        data.test_mat_extr_triu_Pu.Ap[2] = 3;
        data.test_mat_extr_triu_Pu.Ap[3] = 5;
        data.test_mat_extr_triu_Pu.Ap[4] = 9;
        data.test_mat_extr_triu_Pu.Ap[5] = 14;

        data.test_mat_extr_triu_P_inf_norm_cols = new double[5];
        data.test_mat_extr_triu_P_inf_norm_cols[0] = 1.25636243709775197175;
        data.test_mat_extr_triu_P_inf_norm_cols[1] = 1.56060373790060746835;
        data.test_mat_extr_triu_P_inf_norm_cols[2] = 1.38118030249938827936;
        data.test_mat_extr_triu_P_inf_norm_cols[3] = 1.38118030249938827936;
        data.test_mat_extr_triu_P_inf_norm_cols[4] = 1.07939560863581207606;
        data.test_qpform_n = 4;

        // Matrix test_qpform_Pu
        //----------------------
        data.test_qpform_Pu = new CSCMatrix(4,4,9,new int[5],new int[9], new double[9]);
        data.test_qpform_Pu.Ax[0] = 0.69800328136771883081;
        data.test_qpform_Pu.Ax[1] = 0.79233021930625791018;
        data.test_qpform_Pu.Ax[2] = 1.61026308051140309985;
        data.test_qpform_Pu.Ax[3] = 1.02429538602019309934;
        data.test_qpform_Pu.Ax[4] = 0.56914053205563541749;
        data.test_qpform_Pu.Ax[5] = 0.41158735390014400402;
        data.test_qpform_Pu.Ax[6] = 0.73068020052611559745;
        data.test_qpform_Pu.Ax[7] = 0.87629028108733897362;
        data.test_qpform_Pu.Ax[8] = 0.54227105409040754491;
       // data.test_qpform_Pu.Ai = (c_int*) c_malloc(9 * sizeof(c_int));
        data.test_qpform_Pu.Ai[0] = 0;
        data.test_qpform_Pu.Ai[1] = 0;
        data.test_qpform_Pu.Ai[2] = 1;
        data.test_qpform_Pu.Ai[3] = 0;
        data.test_qpform_Pu.Ai[4] = 1;
        data.test_qpform_Pu.Ai[5] = 2;
        data.test_qpform_Pu.Ai[6] = 0;
        data.test_qpform_Pu.Ai[7] = 1;
        data.test_qpform_Pu.Ai[8] = 2;
        //data.test_qpform_Pu.Ap = (c_int*) c_malloc((4 + 1) * sizeof(c_int));
        data.test_qpform_Pu.Ap[0] = 0;
        data.test_qpform_Pu.Ap[1] = 1;
        data.test_qpform_Pu.Ap[2] = 3;
        data.test_qpform_Pu.Ap[3] = 6;
        data.test_qpform_Pu.Ap[4] = 9;

        data.test_qpform_x = new double[4];
        data.test_qpform_x[0] = 0.35913333179380452220;
        data.test_qpform_x[1] = 0.62222041446793285857;
        data.test_qpform_x[2] = 0.96078194484322809732;
        data.test_qpform_x[3] = 0.75837034716676965385;
        data.test_qpform_value = 2.42504111102000630140;

        return data;


        };



 };

/*lin_alg_sols_data *  generate_problem_lin_alg_sols_data();
void clean_problem_lin_alg_sols_data(lin_alg_sols_data * data);
 function to define problem data
lin_alg_sols_data *  generate_problem_lin_alg_sols_data(){

lin_alg_sols_data * data = (lin_alg_sols_data *)c_malloc(sizeof(lin_alg_sols_data));*/