onerror {quit -f}
vlib work
vlog -work work jk_flipflop.vo
vlog -work work jk_flipflop.vt
vsim -novopt -c -t 1ps -L cycloneive_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.jk_flipflop_vlg_vec_tst
vcd file -direction jk_flipflop.msim.vcd
vcd add -internal jk_flipflop_vlg_vec_tst/*
vcd add -internal jk_flipflop_vlg_vec_tst/i1/*
add wave /*
run -all