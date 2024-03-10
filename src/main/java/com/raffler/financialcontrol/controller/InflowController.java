package com.raffler.financialcontrol.controller;


import com.raffler.financialcontrol.DTO.request.InflowDTO;
import com.raffler.financialcontrol.DTO.response.MessageResponseDTO;
import com.raffler.financialcontrol.service.InflowService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/inflows")
@AllArgsConstructor
public class InflowController {

    InflowService inflowService;


    @GetMapping("/{month-year}")
    @ResponseStatus(HttpStatus.OK)
    public List<InflowDTO> listInflowsByMonth(@PathVariable("month-year") String monthYear){
        return inflowService.listByMonthYear(monthYear);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO saveNewInflow(@RequestBody InflowDTO inflowDTO){
        return inflowService.saveInflow(inflowDTO);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO updateInflowById(@Valid @RequestBody InflowDTO inflowDTO){
        return inflowService.editInflow(inflowDTO);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO deleteInflowById(@Valid @RequestBody InflowDTO inflowDTO){
        return inflowService.deleteInflow(inflowDTO);
    }


    //delete - remove inflow

}
