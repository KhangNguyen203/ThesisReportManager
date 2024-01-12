/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vxv.bosung;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author xuanv
 */
public class Config {
    public static Scanner scanner = new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
}
