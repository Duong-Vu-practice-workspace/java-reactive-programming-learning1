package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec02.assignment.FileServiceImpl;

public class Lec12Assignment {
    public static void main(String[] args) {
        var fileService = new FileServiceImpl();
        fileService.write("file.txt", "This is a test file")
                .subscribe(Util.subscriber());
        fileService.read("file.txt")
                .subscribe(Util.subscriber());
        fileService.delete("file.txt")
                .subscribe(Util.subscriber());
    }
}
